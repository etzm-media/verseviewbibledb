package org.endtimezionministries;

import com.google.gson.Gson;
import org.endtimezionministries.model.APIResponse;
import org.endtimezionministries.model.internal.BibleVerse;
import org.endtimezionministries.model.internal.Chapter;
import org.endtimezionministries.model.internal.Verse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	private static final String BASE_URL = "https://www.bible.com/_next/data/CWmRI3yHqcTbXiWEpD0bg";
	private static final HttpClient client = HttpClient.newHttpClient();
	private static final Gson gson = new Gson();
	private static final BibleVerse bibleVerses = new BibleVerse();

	public static APIResponse fetchBibleChapter(String language, String versionId, String book, String chapter)
			throws IOException, InterruptedException {
		String url = String.format("%s/%s/audio-bible/%s/%s.%s.TCV.json?versionId=%s&usfm=%s.%s.TCV",
				BASE_URL, language, versionId, book, chapter, versionId, book, chapter);

		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create(url))
				.header("Accept", "application/json")
				.GET()
				.build();

		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		if (response.statusCode() != 200) {
			throw new IOException("Failed to fetch Bible chapter. Status code: " + response.statusCode());
		}

		System.out.println(response.body());

		// Use Gson to automatically deserialize the JSON response to APIResponse object
		return gson.fromJson(response.body(), APIResponse.class);
	}

	public static void parseVerses(String content) {
		if (content == null || content.isEmpty())
			return;

		// Find book code from class bkXXX (e.g. bkGEN)
		Pattern bookPattern = Pattern.compile("<div\\s+class=\"book\\s+bk([A-Za-z0-9_\\-]+)\"",
				Pattern.CASE_INSENSITIVE);
		Matcher bookMatcher = bookPattern.matcher(content);
		String bookCode = "UNKNOWN";
		if (bookMatcher.find()) {
			bookCode = bookMatcher.group(1);
		}

		// Find chapter number from class chN (e.g. ch1) or data-usfm attribute
		Pattern chapterPattern = Pattern.compile(
				"<div\\s+class=\"chapter\\s+ch(\\d+)\"(?:[^>]*data-usfm=\"([^\"]+)\")?", Pattern.CASE_INSENSITIVE);
		Matcher chapterMatcher = chapterPattern.matcher(content);
		int chapterNum = -1;
		if (chapterMatcher.find()) {
			try {
				chapterNum = Integer.parseInt(chapterMatcher.group(1));
			} catch (NumberFormatException ignored) {
			}
		}

		// Pattern to capture individual verses: <span class="verse v{num}" ...> ...
		// <span class="content">TEXT</span>
		Pattern versePattern = Pattern.compile(
				"<span\\s+class=\"verse\\s+v(\\d+)\"[^>]*>.*?<span\\s+class=\"content\">(.*?)</span>",
				Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
		Matcher verseMatcher = versePattern.matcher(content);

		StringBuilder chapterBuilder = new StringBuilder();
		boolean foundAny = false;
		List<Verse> versesList = new ArrayList<>();
		while (verseMatcher.find()) {
			foundAny = true;
			String verseNumber = verseMatcher.group(1);
			String verseHtml = verseMatcher.group(2);

			// Remove any HTML tags inside verseHtml
			String verseText = verseHtml.replaceAll("<[^>]+>", "");
			// Decode numeric HTML entities like &#2950;
			verseText = decodeNumericEntities(verseText);
			verseText = verseText.replaceAll("\\s+", " ").trim();

			chapterBuilder.append(verseNumber).append(". ").append(verseText).append("\n");

			// create or append to Verse object
			if(!verseText.isEmpty()) {
                int verseNum;
                try {
                    verseNum = Integer.parseInt(verseNumber);
                } catch (NumberFormatException e) {
                    verseNum = -1;
                }
                
                // Look for existing verse with this number
                Verse existingVerse = null;
                for (Verse v : versesList) {
                    if (v.getVerseNumber() == verseNum) {
                        existingVerse = v;
                        break;
                    }
                }
                
                if (existingVerse != null) {
                    // Append to existing verse
                    existingVerse.setVerse(existingVerse.getVerse() + " " + verseText);
                } else {
                    // Create new verse
                    Verse v = new Verse();
                    v.setVerseNumber(verseNum);
                    v.setVerse(verseText);
                    versesList.add(v);
                }
            }
		}

		if (!foundAny) {
			// As a fallback, try to extract any content blocks
			String fallback = content.replaceAll("<[^>]+>", "").replaceAll("\\s+", " ").trim();
			if (!fallback.isEmpty())
				chapterBuilder.append(fallback).append("\n");
		}

		// store into bibleVerses model as Chapter and Verse objects
		Chapter chapterObj = new Chapter();
		if (chapterNum <= 0)
			chapterNum = 1;
		chapterObj.setChapterNumber(chapterNum);

		// build verses objects (we collected them earlier in versesList)
		List<Verse> verses = (versesList == null) ? new ArrayList<>() : versesList;
		chapterObj.setVerses(verses);

		// ensure bibleVerses book name and chapter list exist
		if (bibleVerses.getBookName() == null) {
			bibleVerses.setBookName(bookCode);
		}
		List<Chapter> chapters = bibleVerses.getChapters();
		if (chapters == null) {
			chapters = new ArrayList<>();
			bibleVerses.setChapters(chapters);
		}

		// replace existing chapter if present, otherwise add
		boolean replaced = false;
		for (int i = 0; i < chapters.size(); i++) {
			if (chapters.get(i).getChapterNumber() == chapterNum) {
				chapters.set(i, chapterObj);
				replaced = true;
				break;
			}
		}
		if (!replaced) {
			chapters.add(chapterObj);
		}

		// Print result for quick verification
		System.out.println("Parsed book=" + bookCode + " chapter=" + chapterNum + " verses=" + verses.size());
	}

	private static String decodeNumericEntities(String s) {
		if (s == null || s.isEmpty())
			return s;
		Pattern p = Pattern.compile("&#(\\d+);?");
		Matcher m = p.matcher(s);
		StringBuffer sb = new StringBuffer();
		while (m.find()) {
			String num = m.group(1);
			try {
				int code = Integer.parseInt(num);
				String ch = new String(Character.toChars(code));
				m.appendReplacement(sb, Matcher.quoteReplacement(ch));
			} catch (NumberFormatException e) {
				m.appendReplacement(sb, m.group());
			}
		}
		m.appendTail(sb);
		// handle common HTML entities
		return sb.toString().replaceAll("&quot;", "\"").replaceAll("&amp;", "&").replaceAll("&lt;", "<")
				.replaceAll("&gt;", ">");
	}

	public static void main(String[] args) {
		try {
			APIResponse response = fetchBibleChapter("en", "2730", "GEN", "1");
			parseVerses(response.getPageProps().getChapterInfo().getContent());
            int a = 1;
		} catch (IOException | InterruptedException e) {
			System.err.println("Error fetching Bible chapter: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
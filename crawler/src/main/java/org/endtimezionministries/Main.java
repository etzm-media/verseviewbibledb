package org.endtimezionministries;

import com.google.gson.Gson;
import org.endtimezionministries.model.APIResponse;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class Main {
	private static final String BASE_URL = "https://www.bible.com/_next/data/CWmRI3yHqcTbXiWEpD0bg";
	private static final HttpClient client = HttpClient.newHttpClient();
	private static final Gson gson = new Gson();
    private static final Map<String, Map<Integer, String>> bibleVerses = new HashMap<>();

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

	public static void main(String[] args) {
		try {
			APIResponse response = fetchBibleChapter("en", "2730", "GEN", "1");
			String content = response.getPageProps().getChapterInfo().getContent();

            // Parse here

		} catch (IOException | InterruptedException e) {
			System.err.println("Error fetching Bible chapter: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
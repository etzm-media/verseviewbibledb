package org.endtimezionministries.repository;

import org.endtimezionministries.model.internal.BibleBook;
import org.endtimezionministries.model.internal.Chapter;
import org.endtimezionministries.model.internal.Verse;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import java.io.File;
import java.util.*;

public class Data {
    public static final List<BibleBook> bibleBooks = new ArrayList<>();
    public static final Map<String, Integer> bookAndMaxChapter = createBookAndMaxChapter();

    public static final File outputXMLFile = new File("/Users/samsonchristopher/Documents/EndTimeZionMinistries/verseviewbibledb/tamil.tcv.xml");

    private static Map<String, Integer> createBookAndMaxChapter() {
        // LinkedHashMap preserves insertion order when iterating
        LinkedHashMap<String, Integer> m = new LinkedHashMap<>();
        m.put("GEN", 50);
        m.put("EXO", 40);
        m.put("LEV", 27);
        m.put("NUM", 36);
        m.put("DEU", 34);
        m.put("JOS", 24);
        m.put("JDG", 21);
        m.put("RUT", 4);
        m.put("1SA", 31);
        m.put("2SA", 24);
        m.put("1KI", 22);
        m.put("2KI", 25);
        m.put("1CH", 29);
        m.put("2CH", 36);
        m.put("EZR", 10);
        m.put("NEH", 13);
        m.put("EST", 10);
        m.put("JOB", 42);
        m.put("PSA", 150);
        m.put("PRO", 31);
        m.put("ECC", 12);
        m.put("SNG", 8);
        m.put("ISA", 66);
        m.put("JER", 52);
        m.put("LAM", 5);
        m.put("EZK", 48);
        m.put("DAN", 12);
        m.put("HOS", 14);
        m.put("JOL", 3);
        m.put("AMO", 9);
        m.put("OBA", 1);
        m.put("JON", 4);
        m.put("MIC", 7);
        m.put("NAM", 3);
        m.put("HAB", 3);
        m.put("ZEP", 3);
        m.put("HAG", 2);
        m.put("ZEC", 14);
        m.put("MAL", 4);
        m.put("MAT", 28);
        m.put("MRK", 16);
        m.put("LUK", 24);
        m.put("JHN", 21);
        m.put("ACT", 28);
        m.put("ROM", 16);
        m.put("1CO", 16);
        m.put("2CO", 13);
        m.put("GAL", 6);
        m.put("EPH", 6);
        m.put("PHP", 4);
        m.put("COL", 4);
        m.put("1TH", 5);
        m.put("2TH", 3);
        m.put("1TI", 6);
        m.put("2TI", 4);
        m.put("TIT", 3);
        m.put("PHM", 1);
        m.put("HEB", 13);
        m.put("JAS", 5);
        m.put("1PE", 5);
        m.put("2PE", 3);
        m.put("1JN", 5);
        m.put("2JN", 1);
        m.put("3JN", 1);
        m.put("JUD", 1);
        m.put("REV", 22);
        return Collections.unmodifiableMap(m);
    }

    public static final List<String> bookNames = new ArrayList<>(Arrays.asList("ஆதியாகமம்","யாத்திராகமம்","லேவியராகமம்","எண்ணாகமம்","உபாகமம்","யோசுவா","நியாயாதிபதிகள்","ரூத்","1 சாமுவேல்","2 சாமுவேல்","1 இராஜாக்கள்","2 இராஜாக்கள்","1 நாளாகமம்","2 நாளாகமம்","எஸ்றா","நெகேமியா","எஸ்தர்","யோபு","சங்கீதம்","நீதிமொழிகள்","பிரசங்கி","உன்னதப்பாட்டு","ஏசாயா","எரேமியா","புலம்பல்","எசேக்கியேல்","தானியேல்","ஓசியா","யோவேல்","ஆமோஸ்","ஒபதியா","யோனா","மீகா","நாகூம்","ஆபகூக்","செப்பனியா","ஆகாய்","சகரியா","மல்கியா","மத்தேயு","மாற்கு","லூக்கா","யோவான்","அப்போஸ்தலர்","ரோமர்","1 கொரிந்தியர்","2 கொரிந்தியர்","கலாத்தியர்","எபேசியர்","பிலிப்பியர்","கொலோசெயர்","1 தெசலோனிக்கேயர்","2 தெசலோனிக்கேயர்","1 தீமோத்தேயு","2 தீமோத்தேயு","தீத்து","பிலேமோன்","எபிரெயர்","யாக்கோபு","1 பேதுரு","2 பேதுரு","1 யோவான்","2 யோவான்","3 யோவான்","யூதா","வெளிப்படுத்தின விசேஷம்"));

    /**
     * Write the contents of Data.bibleBooks into the configured XML file in a format
     * similar to the existing `tamil.tcv.xml` header and with <book>/<chapter>/<verse> elements.
     * This method is safe to call even if bibleBooks is empty; it will at least write the header.
     */
    public static void writeBibleBooksToXml() throws IOException {
        // ensure parent dir exists
        if (outputXMLFile.getParentFile() != null) {
            outputXMLFile.getParentFile().mkdirs();
        }

        // Build a map from book code (GEN, EXO, ...) to Tamil name using insertion order
        Map<String, String> codeToTamil = new LinkedHashMap<>();
        int idx = 0;
        for (String code : bookAndMaxChapter.keySet()) {
            String name = (idx < bookNames.size()) ? bookNames.get(idx) : code;
            codeToTamil.put(code, name);
            idx++;
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputXMLFile))) {
            bw.write("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n");
            bw.write("<bible xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" biblename=\"Tamil TCV\">\n");
            bw.write("\t<fname>tamil.tcv.xml</fname>\n");
            bw.write("\t<revision>1</revision>\n");
            bw.write("\t<title>Tamil TCV</title>\n");
            bw.write("\t<font>Arial Unicode MS</font>\n");
            bw.write("\t<copyright>Indian Tamil Contemporary Version 2022 Biblica, Inc.</copyright>\n");
            bw.write("\t<sizefactor>1</sizefactor>\n\n");

            // booknames CDATA
            String joinedNames = String.join(",", bookNames);
            bw.write("\t<booknames><![CDATA[");
            bw.write(joinedNames);
            bw.write("]]></booknames>\n\n");

            // write actual books, chapters and verses
            int index = 1;
            for (BibleBook b : bibleBooks) {
                if (b == null) continue;
                String code = b.getBookName();
                if (code == null) continue;
                String tamilName = codeToTamil.getOrDefault(code, code);
                bw.write(String.format("\t<b bnumber=\"%s\" bname=\"%s\">\n", index, escapeXml(tamilName)));

                List<Chapter> chapters = b.getChapters();
                if (chapters != null) {
                    // sort chapters by chapterNumber for safety
                    chapters.sort(Comparator.comparingInt(Chapter::getChapterNumber));
                    for (Chapter c : chapters) {
                        if (c == null) continue;
                        bw.write(String.format("\t\t<c cnumber=\"%d\">\n", c.getChapterNumber()));
                        List<Verse> verses = c.getVerses();
                        if (verses != null) {
                            verses.sort(Comparator.comparingInt(Verse::getVerseNumber));
                            for (Verse v : verses) {
                                if (v == null) continue;
                                String text = v.getVerse() == null ? "" : v.getVerse();
                                bw.write(String.format("\t\t\t<v vnumber=\"%d\">", v.getVerseNumber()));
                                bw.write(wrapCData(text));
                                bw.write("</v>\n");
                            }
                        }
                        bw.write("\t\t</c>\n");
                    }
                }

                bw.write("\t</b>\n");
                index += 1;
            }
            bw.write("</bible>\n");
        }
    }

    private static String wrapCData(String s) {
        if (s == null) s = "";
        // avoid closing sequence inside CDATA
        s = s.replace("]]>", "]]]>>");
        return s;
    }

    private static String escapeXml(String s) {
        if (s == null) return "";
        return s.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                .replace("\"", "&quot;").replace("'", "&apos;");
    }
}

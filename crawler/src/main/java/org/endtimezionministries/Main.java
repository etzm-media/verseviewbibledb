package org.endtimezionministries;

import org.endtimezionministries.repository.Data;

import java.io.IOException;
import java.util.Map;

import static org.endtimezionministries.Util.fetchBibleChapter;
import static org.endtimezionministries.Util.parseVerses;

public class Main {

	public static void main(String[] args) {
		try {
            for (Map.Entry<String, Integer> entry : Data.bookAndMaxChapter.entrySet()) {
                String bookName = entry.getKey();
                int maxChapter = entry.getValue();

                for(int i=1; i<=maxChapter; i++) {
                    parseVerses(fetchBibleChapter("en", "2730", bookName, String.valueOf(i)).getPageProps().getChapterInfo().getContent());
                }
            }
            int a = 1;
		} catch (IOException | InterruptedException e) {
			System.err.println("Error fetching Bible chapter: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
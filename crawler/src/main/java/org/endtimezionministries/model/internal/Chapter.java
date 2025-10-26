package org.endtimezionministries.model.internal;

import java.util.List;

public class Chapter {
    int chapterNumber;
    List<Verse> verses;

    public int getChapterNumber() {
        return chapterNumber;
    }

    public void setChapterNumber(int chapterNumber) {
        this.chapterNumber = chapterNumber;
    }

    public List<Verse> getVerses() {
        return verses;
    }

    public void setVerses(List<Verse> verses) {
        this.verses = verses;
    }
}

package org.endtimezionministries.model.internal;

import java.util.List;

public class BibleVerse {
    String bookName;
    List<Chapter> chapters;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }

    public void setChapters(List<Chapter> chapters) {
        this.chapters = chapters;
    }
}

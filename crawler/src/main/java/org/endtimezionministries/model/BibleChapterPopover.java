package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class BibleChapterPopover {

   @SerializedName("book")
   String book;

   @SerializedName("back")
   String back;

   @SerializedName("chapter")
   String chapter;

   @SerializedName("cancel")
   String cancel;

   @SerializedName("loading")
   String loading;

   @SerializedName("filter_books")
   String filterBooks;


    public void setBook(String book) {
        this.book = book;
    }
    public String getBook() {
        return book;
    }
    
    public void setBack(String back) {
        this.back = back;
    }
    public String getBack() {
        return back;
    }
    
    public void setChapter(String chapter) {
        this.chapter = chapter;
    }
    public String getChapter() {
        return chapter;
    }
    
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }
    public String getCancel() {
        return cancel;
    }
    
    public void setLoading(String loading) {
        this.loading = loading;
    }
    public String getLoading() {
        return loading;
    }
    
    public void setFilterBooks(String filterBooks) {
        this.filterBooks = filterBooks;
    }
    public String getFilterBooks() {
        return filterBooks;
    }
    
}
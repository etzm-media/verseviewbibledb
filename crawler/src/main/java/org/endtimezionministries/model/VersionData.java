package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class VersionData {

   @SerializedName("audio")
   boolean audio;

   @SerializedName("copyright_short")
   CopyrightShort copyrightShort;

   @SerializedName("id")
   int id;

   @SerializedName("language")
   Language language;

   @SerializedName("local_abbreviation")
   String localAbbreviation;

   @SerializedName("local_title")
   String localTitle;

   @SerializedName("publisher")
   Publisher publisher;

   @SerializedName("reader_footer")
   ReaderFooter readerFooter;

   @SerializedName("reader_footer_url")
   String readerFooterUrl;


    public void setAudio(boolean audio) {
        this.audio = audio;
    }
    public boolean getAudio() {
        return audio;
    }
    
    public void setCopyrightShort(CopyrightShort copyrightShort) {
        this.copyrightShort = copyrightShort;
    }
    public CopyrightShort getCopyrightShort() {
        return copyrightShort;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setLanguage(Language language) {
        this.language = language;
    }
    public Language getLanguage() {
        return language;
    }
    
    public void setLocalAbbreviation(String localAbbreviation) {
        this.localAbbreviation = localAbbreviation;
    }
    public String getLocalAbbreviation() {
        return localAbbreviation;
    }
    
    public void setLocalTitle(String localTitle) {
        this.localTitle = localTitle;
    }
    public String getLocalTitle() {
        return localTitle;
    }
    
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    
    public void setReaderFooter(ReaderFooter readerFooter) {
        this.readerFooter = readerFooter;
    }
    public ReaderFooter getReaderFooter() {
        return readerFooter;
    }
    
    public void setReaderFooterUrl(String readerFooterUrl) {
        this.readerFooterUrl = readerFooterUrl;
    }
    public String getReaderFooterUrl() {
        return readerFooterUrl;
    }
    
}
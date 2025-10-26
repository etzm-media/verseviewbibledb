package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class SidebarContent {

   @SerializedName("appcard_body")
   String appcardBody;

   @SerializedName("appcard_download")
   String appcardDownload;

   @SerializedName("appcard_headline")
   String appcardHeadline;

   @SerializedName("bafk_appcard_body")
   String bafkAppcardBody;

   @SerializedName("bafk_appcard_download")
   String bafkAppcardDownload;

   @SerializedName("bafk_appcard_headline")
   String bafkAppcardHeadline;

   @SerializedName("title")
   String title;

   @SerializedName("bible_versions")
   String bibleVersions;

   @SerializedName("bible_languages")
   String bibleLanguages;

   @SerializedName("audio_bible_versions")
   String audioBibleVersions;


    public void setAppcardBody(String appcardBody) {
        this.appcardBody = appcardBody;
    }
    public String getAppcardBody() {
        return appcardBody;
    }
    
    public void setAppcardDownload(String appcardDownload) {
        this.appcardDownload = appcardDownload;
    }
    public String getAppcardDownload() {
        return appcardDownload;
    }
    
    public void setAppcardHeadline(String appcardHeadline) {
        this.appcardHeadline = appcardHeadline;
    }
    public String getAppcardHeadline() {
        return appcardHeadline;
    }
    
    public void setBafkAppcardBody(String bafkAppcardBody) {
        this.bafkAppcardBody = bafkAppcardBody;
    }
    public String getBafkAppcardBody() {
        return bafkAppcardBody;
    }
    
    public void setBafkAppcardDownload(String bafkAppcardDownload) {
        this.bafkAppcardDownload = bafkAppcardDownload;
    }
    public String getBafkAppcardDownload() {
        return bafkAppcardDownload;
    }
    
    public void setBafkAppcardHeadline(String bafkAppcardHeadline) {
        this.bafkAppcardHeadline = bafkAppcardHeadline;
    }
    public String getBafkAppcardHeadline() {
        return bafkAppcardHeadline;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setBibleVersions(String bibleVersions) {
        this.bibleVersions = bibleVersions;
    }
    public String getBibleVersions() {
        return bibleVersions;
    }
    
    public void setBibleLanguages(String bibleLanguages) {
        this.bibleLanguages = bibleLanguages;
    }
    public String getBibleLanguages() {
        return bibleLanguages;
    }
    
    public void setAudioBibleVersions(String audioBibleVersions) {
        this.audioBibleVersions = audioBibleVersions;
    }
    public String getAudioBibleVersions() {
        return audioBibleVersions;
    }
    
}
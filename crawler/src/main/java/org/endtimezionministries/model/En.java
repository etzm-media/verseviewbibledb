package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class En {

   @SerializedName("common")
   Common common;

   @SerializedName("cookieConsent")
   CookieConsent cookieConsent;

   @SerializedName("footer")
   Footer footer;

   @SerializedName("header")
   Header header;

   @SerializedName("app")
   App app;

   @SerializedName("bibleChapter")
   BibleChapter bibleChapter;

   @SerializedName("audio-version")
   AudioVersion audioVersion;

   @SerializedName("audio-versions")
   AudioVersions audioVersions;

   @SerializedName("bible-versionPopover")
   BibleVersionPopover bibleVersionPopover;

   @SerializedName("bibleChapterPopover")
   BibleChapterPopover bibleChapterPopover;


    public void setCommon(Common common) {
        this.common = common;
    }
    public Common getCommon() {
        return common;
    }
    
    public void setCookieConsent(CookieConsent cookieConsent) {
        this.cookieConsent = cookieConsent;
    }
    public CookieConsent getCookieConsent() {
        return cookieConsent;
    }
    
    public void setFooter(Footer footer) {
        this.footer = footer;
    }
    public Footer getFooter() {
        return footer;
    }
    
    public void setHeader(Header header) {
        this.header = header;
    }
    public Header getHeader() {
        return header;
    }
    
    public void setApp(App app) {
        this.app = app;
    }
    public App getApp() {
        return app;
    }
    
    public void setBibleChapter(BibleChapter bibleChapter) {
        this.bibleChapter = bibleChapter;
    }
    public BibleChapter getBibleChapter() {
        return bibleChapter;
    }
    
    public void setAudioVersion(AudioVersion audioVersion) {
        this.audioVersion = audioVersion;
    }
    public AudioVersion getAudioVersion() {
        return audioVersion;
    }
    
    public void setAudioVersions(AudioVersions audioVersions) {
        this.audioVersions = audioVersions;
    }
    public AudioVersions getAudioVersions() {
        return audioVersions;
    }
    
    public void setBibleVersionPopover(BibleVersionPopover bibleVersionPopover) {
        this.bibleVersionPopover = bibleVersionPopover;
    }
    public BibleVersionPopover getBibleVersionPopover() {
        return bibleVersionPopover;
    }
    
    public void setBibleChapterPopover(BibleChapterPopover bibleChapterPopover) {
        this.bibleChapterPopover = bibleChapterPopover;
    }
    public BibleChapterPopover getBibleChapterPopover() {
        return bibleChapterPopover;
    }
    
}
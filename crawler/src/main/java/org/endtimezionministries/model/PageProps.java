package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class PageProps {

   @SerializedName("audioVersionInfo")
   AudioVersionInfo audioVersionInfo;

   @SerializedName("chapterInfo")
   ChapterInfo chapterInfo;

   @SerializedName("chapterText")
   String chapterText;

   @SerializedName("locale")
   String locale;

   @SerializedName("usfm")
   String usfm;

   @SerializedName("versionData")
   VersionData versionData;

   @SerializedName("versionId")
   int versionId;

   @SerializedName("_nextI18Next")
   NextI18Next NextI18Next;


    public void setAudioVersionInfo(AudioVersionInfo audioVersionInfo) {
        this.audioVersionInfo = audioVersionInfo;
    }
    public AudioVersionInfo getAudioVersionInfo() {
        return audioVersionInfo;
    }
    
    public void setChapterInfo(ChapterInfo chapterInfo) {
        this.chapterInfo = chapterInfo;
    }
    public ChapterInfo getChapterInfo() {
        return chapterInfo;
    }
    
    public void setChapterText(String chapterText) {
        this.chapterText = chapterText;
    }
    public String getChapterText() {
        return chapterText;
    }
    
    public void setLocale(String locale) {
        this.locale = locale;
    }
    public String getLocale() {
        return locale;
    }
    
    public void setUsfm(String usfm) {
        this.usfm = usfm;
    }
    public String getUsfm() {
        return usfm;
    }
    
    public void setVersionData(VersionData versionData) {
        this.versionData = versionData;
    }
    public VersionData getVersionData() {
        return versionData;
    }
    
    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }
    public int getVersionId() {
        return versionId;
    }
    
    public void setNextI18Next(NextI18Next NextI18Next) {
        this.NextI18Next = NextI18Next;
    }
    public NextI18Next getNextI18Next() {
        return NextI18Next;
    }
    
}
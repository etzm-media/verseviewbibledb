package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class AudioChapterInfo {

   @SerializedName("download_urls")
   DownloadUrls downloadUrls;

   @SerializedName("id")
   int id;

   @SerializedName("version_id")
   int versionId;

   @SerializedName("title")
   String title;

   @SerializedName("timing_available")
   boolean timingAvailable;

   @SerializedName("dramatized")
   boolean dramatized;

   @SerializedName("default")
   boolean defaultValue;


    public void setDownloadUrls(DownloadUrls downloadUrls) {
        this.downloadUrls = downloadUrls;
    }
    public DownloadUrls getDownloadUrls() {
        return downloadUrls;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }
    public int getVersionId() {
        return versionId;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setTimingAvailable(boolean timingAvailable) {
        this.timingAvailable = timingAvailable;
    }
    public boolean getTimingAvailable() {
        return timingAvailable;
    }
    
    public void setDramatized(boolean dramatized) {
        this.dramatized = dramatized;
    }
    public boolean getDramatized() {
        return dramatized;
    }
    
    public void setDefault(boolean defaultValue) {
        this.defaultValue = defaultValue;
    }
    public boolean getDefault() {
        return defaultValue;
    }
    
}
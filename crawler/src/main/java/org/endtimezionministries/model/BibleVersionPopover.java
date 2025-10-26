package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class BibleVersionPopover {

   @SerializedName("back")
   String back;

   @SerializedName("bible_language")
   String bibleLanguage;

   @SerializedName("cancel")
   String cancel;

   @SerializedName("change_language")
   String changeLanguage;

   @SerializedName("filter_languages")
   String filterLanguages;

   @SerializedName("filter_versions")
   String filterVersions;

   @SerializedName("has_audio_available")
   String hasAudioAvailable;

   @SerializedName("language")
   String language;

   @SerializedName("loading")
   String loading;

   @SerializedName("version")
   String version;


    public void setBack(String back) {
        this.back = back;
    }
    public String getBack() {
        return back;
    }
    
    public void setBibleLanguage(String bibleLanguage) {
        this.bibleLanguage = bibleLanguage;
    }
    public String getBibleLanguage() {
        return bibleLanguage;
    }
    
    public void setCancel(String cancel) {
        this.cancel = cancel;
    }
    public String getCancel() {
        return cancel;
    }
    
    public void setChangeLanguage(String changeLanguage) {
        this.changeLanguage = changeLanguage;
    }
    public String getChangeLanguage() {
        return changeLanguage;
    }
    
    public void setFilterLanguages(String filterLanguages) {
        this.filterLanguages = filterLanguages;
    }
    public String getFilterLanguages() {
        return filterLanguages;
    }
    
    public void setFilterVersions(String filterVersions) {
        this.filterVersions = filterVersions;
    }
    public String getFilterVersions() {
        return filterVersions;
    }
    
    public void setHasAudioAvailable(String hasAudioAvailable) {
        this.hasAudioAvailable = hasAudioAvailable;
    }
    public String getHasAudioAvailable() {
        return hasAudioAvailable;
    }
    
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getLanguage() {
        return language;
    }
    
    public void setLoading(String loading) {
        this.loading = loading;
    }
    public String getLoading() {
        return loading;
    }
    
    public void setVersion(String version) {
        this.version = version;
    }
    public String getVersion() {
        return version;
    }
    
}
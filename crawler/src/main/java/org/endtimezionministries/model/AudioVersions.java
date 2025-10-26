package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

public class AudioVersions {

   @SerializedName("number_of_languages")
   String numberOfLanguages;

   @SerializedName("available")
   String available;

   @SerializedName("audio_bible")
   String audioBible;

   @SerializedName("audio_free")
   String audioFree;

   @SerializedName("other_versions")
   String otherVersions;

   @SerializedName("more_versions")
   String moreVersions;

   @SerializedName("number_of_versions")
   String numberOfVersions;

   @SerializedName("read_to_you_bible_app")
   String readToYouBibleApp;

   @SerializedName("read_version")
   String readVersion;

   @SerializedName("read")
   String read;

   @SerializedName("listen")
   String listen;

   @SerializedName("listen_to_the_bible")
   String listenToTheBible;

   @SerializedName("learn_more")
   String learnMore;

   @SerializedName("title")
   String title;

   @SerializedName("description_with_count")
   String descriptionWithCount;

   @SerializedName("audio_bible_meta")
   String audioBibleMeta;

   @SerializedName("publisher")
   String publisher;

   @SerializedName("play_back_speed_aria_text")
   String playBackSpeedAriaText;

   @SerializedName("metadata")
   Metadata metadata;

   @SerializedName("metadata_single")
   MetadataSingle metadataSingle;

   @SerializedName("metadata_listen")
   MetadataListen metadataListen;


    public void setNumberOfLanguages(String numberOfLanguages) {
        this.numberOfLanguages = numberOfLanguages;
    }
    public String getNumberOfLanguages() {
        return numberOfLanguages;
    }
    
    public void setAvailable(String available) {
        this.available = available;
    }
    public String getAvailable() {
        return available;
    }
    
    public void setAudioBible(String audioBible) {
        this.audioBible = audioBible;
    }
    public String getAudioBible() {
        return audioBible;
    }
    
    public void setAudioFree(String audioFree) {
        this.audioFree = audioFree;
    }
    public String getAudioFree() {
        return audioFree;
    }
    
    public void setOtherVersions(String otherVersions) {
        this.otherVersions = otherVersions;
    }
    public String getOtherVersions() {
        return otherVersions;
    }
    
    public void setMoreVersions(String moreVersions) {
        this.moreVersions = moreVersions;
    }
    public String getMoreVersions() {
        return moreVersions;
    }
    
    public void setNumberOfVersions(String numberOfVersions) {
        this.numberOfVersions = numberOfVersions;
    }
    public String getNumberOfVersions() {
        return numberOfVersions;
    }
    
    public void setReadToYouBibleApp(String readToYouBibleApp) {
        this.readToYouBibleApp = readToYouBibleApp;
    }
    public String getReadToYouBibleApp() {
        return readToYouBibleApp;
    }
    
    public void setReadVersion(String readVersion) {
        this.readVersion = readVersion;
    }
    public String getReadVersion() {
        return readVersion;
    }
    
    public void setRead(String read) {
        this.read = read;
    }
    public String getRead() {
        return read;
    }
    
    public void setListen(String listen) {
        this.listen = listen;
    }
    public String getListen() {
        return listen;
    }
    
    public void setListenToTheBible(String listenToTheBible) {
        this.listenToTheBible = listenToTheBible;
    }
    public String getListenToTheBible() {
        return listenToTheBible;
    }
    
    public void setLearnMore(String learnMore) {
        this.learnMore = learnMore;
    }
    public String getLearnMore() {
        return learnMore;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDescriptionWithCount(String descriptionWithCount) {
        this.descriptionWithCount = descriptionWithCount;
    }
    public String getDescriptionWithCount() {
        return descriptionWithCount;
    }
    
    public void setAudioBibleMeta(String audioBibleMeta) {
        this.audioBibleMeta = audioBibleMeta;
    }
    public String getAudioBibleMeta() {
        return audioBibleMeta;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    
    public void setPlayBackSpeedAriaText(String playBackSpeedAriaText) {
        this.playBackSpeedAriaText = playBackSpeedAriaText;
    }
    public String getPlayBackSpeedAriaText() {
        return playBackSpeedAriaText;
    }
    
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }
    public Metadata getMetadata() {
        return metadata;
    }
    
    public void setMetadataSingle(MetadataSingle metadataSingle) {
        this.metadataSingle = metadataSingle;
    }
    public MetadataSingle getMetadataSingle() {
        return metadataSingle;
    }
    
    public void setMetadataListen(MetadataListen metadataListen) {
        this.metadataListen = metadataListen;
    }
    public MetadataListen getMetadataListen() {
        return metadataListen;
    }
    
}
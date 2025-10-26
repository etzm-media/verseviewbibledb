package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

public class AudioVersion {

   @SerializedName("learn_more")
   String learnMore;

   @SerializedName("listen")
   String listen;

   @SerializedName("metadata_single")
   MetadataSingle metadataSingle;

   @SerializedName("other_versions")
   String otherVersions;

   @SerializedName("publisher")
   String publisher;

   @SerializedName("read")
   String read;

   @SerializedName("title")
   String title;

   @SerializedName("versions")
   String versions;


    public void setLearnMore(String learnMore) {
        this.learnMore = learnMore;
    }
    public String getLearnMore() {
        return learnMore;
    }
    
    public void setListen(String listen) {
        this.listen = listen;
    }
    public String getListen() {
        return listen;
    }
    
    public void setMetadataSingle(MetadataSingle metadataSingle) {
        this.metadataSingle = metadataSingle;
    }
    public MetadataSingle getMetadataSingle() {
        return metadataSingle;
    }
    
    public void setOtherVersions(String otherVersions) {
        this.otherVersions = otherVersions;
    }
    public String getOtherVersions() {
        return otherVersions;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getPublisher() {
        return publisher;
    }
    
    public void setRead(String read) {
        this.read = read;
    }
    public String getRead() {
        return read;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setVersions(String versions) {
        this.versions = versions;
    }
    public String getVersions() {
        return versions;
    }
    
}
package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class AudioVersionInfo {

   @SerializedName("title")
   String title;

   @SerializedName("copyright_long")
   CopyrightLong copyrightLong;

   @SerializedName("copyright_short")
   CopyrightShort copyrightShort;

   @SerializedName("version_id")
   int versionId;

   @SerializedName("id")
   int id;

   @SerializedName("publisher_link")
   String publisherLink;

   @SerializedName("dramatized")
   boolean dramatized;

   @SerializedName("publisher")
   Publisher publisher;


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setCopyrightLong(CopyrightLong copyrightLong) {
        this.copyrightLong = copyrightLong;
    }
    public CopyrightLong getCopyrightLong() {
        return copyrightLong;
    }
    
    public void setCopyrightShort(CopyrightShort copyrightShort) {
        this.copyrightShort = copyrightShort;
    }
    public CopyrightShort getCopyrightShort() {
        return copyrightShort;
    }
    
    public void setVersionId(int versionId) {
        this.versionId = versionId;
    }
    public int getVersionId() {
        return versionId;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    
    public void setPublisherLink(String publisherLink) {
        this.publisherLink = publisherLink;
    }
    public String getPublisherLink() {
        return publisherLink;
    }
    
    public void setDramatized(boolean dramatized) {
        this.dramatized = dramatized;
    }
    public boolean getDramatized() {
        return dramatized;
    }
    
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    
}
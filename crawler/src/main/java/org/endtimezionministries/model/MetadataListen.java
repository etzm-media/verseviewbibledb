package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class MetadataListen {

   @SerializedName("title")
   String title;

   @SerializedName("description")
   String description;

   @SerializedName("headline")
   String headline;


    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    
    public void setHeadline(String headline) {
        this.headline = headline;
    }
    public String getHeadline() {
        return headline;
    }
    
}
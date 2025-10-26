package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class Language {

   @SerializedName("iso_639_1")
   String iso6391;

   @SerializedName("iso_639_3")
   String iso6393;

   @SerializedName("language_tag")
   String languageTag;

   @SerializedName("local_name")
   String localName;

   @SerializedName("text_direction")
   String textDirection;


    public void setIso6391(String iso6391) {
        this.iso6391 = iso6391;
    }
    public String getIso6391() {
        return iso6391;
    }
    
    public void setIso6393(String iso6393) {
        this.iso6393 = iso6393;
    }
    public String getIso6393() {
        return iso6393;
    }
    
    public void setLanguageTag(String languageTag) {
        this.languageTag = languageTag;
    }
    public String getLanguageTag() {
        return languageTag;
    }
    
    public void setLocalName(String localName) {
        this.localName = localName;
    }
    public String getLocalName() {
        return localName;
    }
    
    public void setTextDirection(String textDirection) {
        this.textDirection = textDirection;
    }
    public String getTextDirection() {
        return textDirection;
    }
    
}
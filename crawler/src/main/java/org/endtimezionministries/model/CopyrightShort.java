package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class CopyrightShort {

   @SerializedName("html")
   String html;

   @SerializedName("text")
   String text;


    public void setHtml(String html) {
        this.html = html;
    }
    public String getHtml() {
        return html;
    }
    
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
}
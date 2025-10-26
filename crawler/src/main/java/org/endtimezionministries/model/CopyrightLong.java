package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class CopyrightLong {

   @SerializedName("text")
   String text;

   @SerializedName("html")
   String html;


    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return text;
    }
    
    public void setHtml(String html) {
        this.html = html;
    }
    public String getHtml() {
        return html;
    }
    
}
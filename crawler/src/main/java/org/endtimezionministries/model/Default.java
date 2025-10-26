package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class Default {

   @SerializedName("i18n")
   I18n i18n;


    public void setI18n(I18n i18n) {
        this.i18n = i18n;
    }
    public I18n getI18n() {
        return i18n;
    }
    
}
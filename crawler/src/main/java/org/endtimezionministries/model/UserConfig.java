package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class UserConfig {

   @SerializedName("i18n")
   I18n i18n;

   @SerializedName("default")
   Default defaultObj;


    public void setI18n(I18n i18n) {
        this.i18n = i18n;
    }
    public I18n getI18n() {
        return i18n;
    }
    
    public void setDefault(Default defaultObj) {
        this.defaultObj = defaultObj;
    }
    public Default getDefault() {
        return defaultObj;
    }
    
}
package org.endtimezionministries.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class I18n {

   @SerializedName("defaultLocale")
   String defaultLocale;

   @SerializedName("locales")
   List<String> locales;


    public void setDefaultLocale(String defaultLocale) {
        this.defaultLocale = defaultLocale;
    }
    public String getDefaultLocale() {
        return defaultLocale;
    }
    
    public void setLocales(List<String> locales) {
        this.locales = locales;
    }
    public List<String> getLocales() {
        return locales;
    }
    
}
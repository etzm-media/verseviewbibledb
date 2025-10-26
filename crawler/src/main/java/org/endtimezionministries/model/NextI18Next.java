package org.endtimezionministries.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class NextI18Next {

   @SerializedName("initialI18nStore")
   InitialI18nStore initialI18nStore;

   @SerializedName("initialLocale")
   String initialLocale;

   @SerializedName("ns")
   List<String> ns;

   @SerializedName("userConfig")
   UserConfig userConfig;


    public void setInitialI18nStore(InitialI18nStore initialI18nStore) {
        this.initialI18nStore = initialI18nStore;
    }
    public InitialI18nStore getInitialI18nStore() {
        return initialI18nStore;
    }
    
    public void setInitialLocale(String initialLocale) {
        this.initialLocale = initialLocale;
    }
    public String getInitialLocale() {
        return initialLocale;
    }
    
    public void setNs(List<String> ns) {
        this.ns = ns;
    }
    public List<String> getNs() {
        return ns;
    }
    
    public void setUserConfig(UserConfig userConfig) {
        this.userConfig = userConfig;
    }
    public UserConfig getUserConfig() {
        return userConfig;
    }
    
}
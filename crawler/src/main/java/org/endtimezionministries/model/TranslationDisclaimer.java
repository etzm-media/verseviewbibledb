package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class TranslationDisclaimer {

   @SerializedName("translate_english")
   String translateEnglish;


    public void setTranslateEnglish(String translateEnglish) {
        this.translateEnglish = translateEnglish;
    }
    public String getTranslateEnglish() {
        return translateEnglish;
    }
    
}
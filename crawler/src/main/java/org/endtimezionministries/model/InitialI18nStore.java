package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class InitialI18nStore {

   @SerializedName("en")
   En en;


    public void setEn(En en) {
        this.en = en;
    }
    public En getEn() {
        return en;
    }
    
}
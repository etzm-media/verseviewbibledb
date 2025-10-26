package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class CookieConsent {

   @SerializedName("legal_text")
   String legalText;

   @SerializedName("button_label")
   String buttonLabel;


    public void setLegalText(String legalText) {
        this.legalText = legalText;
    }
    public String getLegalText() {
        return legalText;
    }
    
    public void setButtonLabel(String buttonLabel) {
        this.buttonLabel = buttonLabel;
    }
    public String getButtonLabel() {
        return buttonLabel;
    }
    
}
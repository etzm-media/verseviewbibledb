package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class Publisher {

   @SerializedName("name")
   String name;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
}
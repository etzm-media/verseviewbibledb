package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class DownloadUrls {

   @SerializedName("format_mp3_32k")
   String formatMp332k;

   @SerializedName("format_hls")
   String formatHls;


    public void setFormatMp332k(String formatMp332k) {
        this.formatMp332k = formatMp332k;
    }
    public String getFormatMp332k() {
        return formatMp332k;
    }
    
    public void setFormatHls(String formatHls) {
        this.formatHls = formatHls;
    }
    public String getFormatHls() {
        return formatHls;
    }
    
}
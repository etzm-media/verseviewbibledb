package org.endtimezionministries.model;

import com.google.gson.annotations.SerializedName;

   
public class APIResponse {

   @SerializedName("pageProps")
   PageProps pageProps;

   @SerializedName("__N_SSG")
   boolean _NSSG;


    public void setPageProps(PageProps pageProps) {
        this.pageProps = pageProps;
    }
    public PageProps getPageProps() {
        return pageProps;
    }
    
    public void set_NSSG(boolean _NSSG) {
        this._NSSG = _NSSG;
    }
    public boolean get_NSSG() {
        return _NSSG;
    }
    
}
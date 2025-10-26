package org.endtimezionministries.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

   
public class ChapterInfo {

   @SerializedName("audioChapterInfo")
   List<AudioChapterInfo> audioChapterInfo;

   @SerializedName("content")
   String content;

   @SerializedName("copyright")
   Copyright copyright;

   @SerializedName("next")
   Next next;

   @SerializedName("previous")
   Previous previous;

   @SerializedName("reference")
   Reference reference;


    public void setAudioChapterInfo(List<AudioChapterInfo> audioChapterInfo) {
        this.audioChapterInfo = audioChapterInfo;
    }
    public List<AudioChapterInfo> getAudioChapterInfo() {
        return audioChapterInfo;
    }
    
    public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
    
    public void setCopyright(Copyright copyright) {
        this.copyright = copyright;
    }
    public Copyright getCopyright() {
        return copyright;
    }
    
    public void setNext(Next next) {
        this.next = next;
    }
    public Next getNext() {
        return next;
    }
    
    public void setPrevious(Previous previous) {
        this.previous = previous;
    }
    public Previous getPrevious() {
        return previous;
    }
    
    public void setReference(Reference reference) {
        this.reference = reference;
    }
    public Reference getReference() {
        return reference;
    }
    
}
package org.endtimezionministries.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Next {

	@SerializedName("canonical")
	boolean canonical;

	@SerializedName("usfm")
	List<String> usfm;

	@SerializedName("human")
	String human;

	@SerializedName("toc")
	boolean toc;

	@SerializedName("version_id")
	int versionId;

	public void setCanonical(boolean canonical) {
		this.canonical = canonical;
	}

	public boolean getCanonical() {
		return canonical;
	}

	public void setUsfm(List<String> usfm) {
		this.usfm = usfm;
	}

	public List<String> getUsfm() {
		return usfm;
	}

	public void setHuman(String human) {
		this.human = human;
	}

	public String getHuman() {
		return human;
	}

	public void setToc(boolean toc) {
		this.toc = toc;
	}

	public boolean getToc() {
		return toc;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public int getVersionId() {
		return versionId;
	}

}
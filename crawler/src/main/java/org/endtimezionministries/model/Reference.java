package org.endtimezionministries.model;

import java.util.List;

import com.google.gson.annotations.SerializedName;

public class Reference {

	@SerializedName("usfm")
	List<String> usfm;

	@SerializedName("human")
	String human;

	@SerializedName("version_id")
	int versionId;

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

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public int getVersionId() {
		return versionId;
	}

}
package com.Model;

public class Library {
	private int CropId;
	private String CropName;
	private int PathId;
	private String PathName;
	private String CropPart;
	private String CropDesc;
	
	public Library() {
		super();
		this.CropId = CropId;
		this.CropName = CropName;
		this.PathId = PathId;
		this.PathName = PathName;
		this.CropPart = CropPart;
		this.CropDesc = CropDesc;
	}
	
	public int getCropId() {
		return CropId;
	}
	public void setCropId(int cropId) {
		CropId = cropId;
	}
	public String getCropName() {
		return CropName;
	}
	public void setCropName(String cropName) {
		CropName = cropName;
	}
	public int getPathId() {
		return PathId;
	}
	public void setPathId(int pathId) {
		PathId = pathId;
	}
	public String getPathName() {
		return PathName;
	}
	public void setPathName(String pathName) {
		PathName = pathName;
	}
	public String getCropPart() {
		return CropPart;
	}
	public void setCropPart(String cropPart) {
		CropPart = cropPart;
	}
	public String getCropDesc() {
		return CropDesc;
	}
	public void setCropDesc(String cropDesc) {
		CropDesc = cropDesc;
	}
	
	

}

package com.example.nasaapp;

public class UploadClean {
    private  String mArea;
    private  String mDescription;
    private  String mImageUrl;
    private String mKey;

    public UploadClean(){

    }
    public UploadClean(String area,String description ,String imageurl){
        if (area.trim().equals(""))
        {
            area = "No Area";
        }
        mArea = area;
        mDescription = description;
        mImageUrl = imageurl;
    }

    public String getArea() {
        return mArea;
    }

    public void setArea(String area) {
        this.mArea = area;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    public void setImageUrl(String imageurl) {
        this.mImageUrl = imageurl;
    }

    public String getmKey() {
        return mKey;
    }

    public void setmKey(String mKey) {
        this.mKey = mKey;
    }
}

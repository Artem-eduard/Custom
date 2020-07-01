package com.example.custom.ui.model;

public class MyListData{
    private String title;
    private String description;
    private int imgId;
    public MyListData(String title, String description, int imgId) {
        this.description = description;
        this.imgId = imgId;
        this.title = title;
    }
    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
}
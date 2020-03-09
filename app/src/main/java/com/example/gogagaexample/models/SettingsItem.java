package com.example.gogagaexample.models;

public class SettingsItem {
    public SettingsItem(int imageId, String text) {
        this.imageId = imageId;
        this.text = text;
    }

    private int imageId;
    private String text;

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

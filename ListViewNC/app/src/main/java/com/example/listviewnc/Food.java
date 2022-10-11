package com.example.listviewnc;

public class Food {
    private int sourceImage;
    private String title;

    public Food(int sourceImage, String title) {
        this.sourceImage = sourceImage;
        this.title = title;
    }

    public int getSourceImage() {
        return sourceImage;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

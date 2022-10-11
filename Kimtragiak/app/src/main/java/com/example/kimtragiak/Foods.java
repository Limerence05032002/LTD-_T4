package com.example.kimtragiak;

import java.io.Serializable;

public class Foods  {
    private String title;
    private int sourceImage;
    private int sourceStar;
    private String mota_food,nl_food,calo_food,dd_food,gia_food;

    public Foods() {

    }

    public Foods(String title, int sourceImage, int sourceStar, String mota_food, String nl_food, String calo_food, String dd_food, String gia_food) {
        this.title = title;
        this.sourceImage = sourceImage;
        this.sourceStar = sourceStar;
        this.mota_food = mota_food;
        this.nl_food = nl_food;
        this.calo_food = calo_food;
        this.dd_food = dd_food;
        this.gia_food = gia_food;
    }

    public String getTitle() {
        return title;
    }

    public int getSourceImage() {
        return sourceImage;
    }


    public int getSourceStar() {
        return sourceStar;
    }

    public String getMota_food() {
        return mota_food;
    }

    public String getNl_food() {
        return nl_food;
    }

    public String getCalo_food() {
        return calo_food;
    }

    public String getDd_food() {
        return dd_food;
    }

    public String getGia_food() {
        return gia_food;
    }
    ///

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSourceImage(int sourceImage) {
        this.sourceImage = sourceImage;
    }

    public void setSourceStar(int sourceStar) {
        this.sourceStar = sourceStar;
    }

    public void setMota_food(String mota_food) {
        this.mota_food = mota_food;
    }

    public void setNl_food(String nl_food) {
        this.nl_food = nl_food;
    }

    public void setCalo_food(String calo_food) {
        this.calo_food = calo_food;
    }

    public void setDd_food(String dd_food) {
        this.dd_food = dd_food;
    }

    public void setGia_food(String gia_food) {
        this.gia_food = gia_food;
    }
}

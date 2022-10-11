package com.example.listviewnc;

import java.util.List;

public class Category {
    private String nameCategory;
    private List<Food> foods;

    public Category(String nameCategory, List<Food> foods) {
        this.nameCategory = nameCategory;
        this.foods = foods;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }


}

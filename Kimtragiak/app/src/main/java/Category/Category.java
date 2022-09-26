package Category;

import java.util.List;

import Food.Food;

public class Category {
    private String nameCategory;
    private int imgStar;
    private List<Food> foods;

    public Category(String nameCategory, int imgStar, List<Food> foods) {
        this.nameCategory = nameCategory;
        this.imgStar = imgStar;
        this.foods = foods;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public int getImgStar() {
        return imgStar;
    }

    public void setImgStar(int imgStar) {
        this.imgStar = imgStar;
    }

    public List<Food> getFoods() {
        return foods;
    }

    public void setFoods(List<Food> foods) {
        this.foods = foods;
    }
}

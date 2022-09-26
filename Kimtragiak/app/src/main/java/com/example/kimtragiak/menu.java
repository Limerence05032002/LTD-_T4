package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import Category.Category;
import Category.CategoryAdapter;
import Food.Food;

public class menu extends AppCompatActivity {
    private RecyclerView rcvCAtegory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        rcvCAtegory = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCAtegory.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getListCategory());
        rcvCAtegory.setAdapter(categoryAdapter);
    }

    private List<Category> getListCategory() {
        List<Category> listCategory = new ArrayList<>();

        List<Food> listFood = new ArrayList<>();
        listFood.add(new Food(R.drawable.monan_beef,R.drawable.star, "Beef Steak"));
        listFood.add(new Food(R.drawable.monan_ghe,R.drawable.star,"Ghẹ hấp củ"));
        listFood.add(new Food(R.drawable.monan_nui,R.drawable.star,"Nui lốc xoáy"));
        listFood.add(new Food(R.drawable.monan_xoi,R.drawable.star, "Xôi gà ác"));

        List<Food> listFood2 = new ArrayList<>();
        listFood2.add(new Food(R.drawable.monan_xoi,R.drawable.star, "Xôi gà ác"));
        listFood2.add(new Food(R.drawable.monan_tom,R.drawable.star,"Tôm cháy tỏi"));
        listFood2.add(new Food(R.drawable.monan_ghe,R.drawable.star,"Ghẹ hấp củ"));
        listFood2.add(new Food(R.drawable.monan_spaghetti,R.drawable.star, "Spaghetti vẹm"));


        listCategory.add(new Category("Popular foods",R.drawable.star, listFood));
        listCategory.add(new Category("Popular foods 1",R.drawable.star, listFood2));
        listCategory.add(new Category("Popular foods 2",R.drawable.star, listFood));


        return listCategory;
    }
}
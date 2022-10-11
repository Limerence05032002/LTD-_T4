package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCAtegory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        listFood.add(new Food(R.drawable.headset,"Beef Steak"));
        listFood.add(new Food(R.drawable.skateboard,"Ghẹ hấp củ"));


        listCategory.add(new Category("Popular foods", listFood));


        return listCategory;
    }
}
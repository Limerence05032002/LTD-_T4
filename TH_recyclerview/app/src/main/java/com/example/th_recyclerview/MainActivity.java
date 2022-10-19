package com.example.th_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcv_category;
    private CategoryAdapter categoryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcv_category = findViewById(R.id.rcv_category);
        categoryAdapter = new CategoryAdapter(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL, false);
        rcv_category.setLayoutManager(linearLayoutManager);

        categoryAdapter.setData(getDataList());
        rcv_category.setAdapter(categoryAdapter);
    }

    private List<Category> getDataList() {
        List<Category> list = new ArrayList<>();

        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book(R.drawable.beef,"Thịt bòa"));
        bookList.add(new Book(R.drawable.ghe,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.spaghetti,"spaghetti"));
        bookList.add(new Book(R.drawable.nui,"nui"));


        bookList.add(new Book(R.drawable.beef,"Thịt bòa"));
        bookList.add(new Book(R.drawable.ghe,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.spaghetti,"spaghetti"));
        bookList.add(new Book(R.drawable.nui,"nui"));


        bookList.add(new Book(R.drawable.beef,"Thịt bòa"));
        bookList.add(new Book(R.drawable.ghe,"Ghẹ ngon"));
        bookList.add(new Book(R.drawable.spaghetti,"spaghetti"));
        bookList.add(new Book(R.drawable.nui,"nui"));


        list.add(new Category("Món ăn ngon",bookList));
        list.add(new Category("Món ăn ngon",bookList));
        list.add(new Category("Món ăn ngon",bookList));

        return list;
    }
}
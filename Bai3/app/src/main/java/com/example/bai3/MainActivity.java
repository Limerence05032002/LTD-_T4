package com.example.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonHoc;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMonHoc = findViewById(R.id.lvMonHoc);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("1");
        arrayCourse.add("2");
        arrayCourse.add("3");
        arrayCourse.add("4");
        arrayCourse.add("5");
        arrayCourse.add("6");

        ArrayAdapter adapter =new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);

        lvMonHoc.setAdapter(adapter);
    }
}
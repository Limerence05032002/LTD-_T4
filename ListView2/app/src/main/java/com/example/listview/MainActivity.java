package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    ArrayList<String> arrayCourse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView1 = findViewById(R.id.listview1);
        arrayCourse = new ArrayList<>();

        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");
        arrayCourse.add("Trung Anh");

        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_list_item_1, arrayCourse);

        listView1.setAdapter(adapter);
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, arrayCourse.get(i), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
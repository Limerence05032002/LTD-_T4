package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    public static ArrayList<String> arrayName;
    private ImageView imgGoc, imgNhan;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgGoc = (ImageView) findViewById(R.id.imageGoc);
        imgNhan = findViewById(R.id.imgNhan);

        String[] mangTen = getResources().getStringArray(R.array.listName);
        arrayName = new ArrayList<>(Arrays.asList(mangTen));

        Collections.shuffle(arrayName);

        int idHinh = getResources().getIdentifier(arrayName.get(5),"drawable",getPackageName());

        imgGoc.setImageResource(idHinh);
        imgNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, ImageActivity.class));
            }
        });
    }
}
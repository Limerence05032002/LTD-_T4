package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;

public class ImageActivity extends AppCompatActivity {
    TableLayout myTable;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        myTable = findViewById(R.id.tableImage);
        int Sodong = 3;
        int SoCot = 2;

        for (int i =1; i <=Sodong; i++){
            TableRow tableRow = new TableRow(this);

            for(int j = 1; j<= SoCot;j++){
                ImageView imageView = new ImageView(this);
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(180,180);
                imageView.setLayoutParams(layoutParams);
                int idHinh = getResources().getIdentifier(MainActivity.arrayName.get(0),"drawable", getPackageName());
                imageView.setImageResource(idHinh);

                tableRow.addView(imageView);

            }
            myTable.addView(tableRow);
        }
    }
}
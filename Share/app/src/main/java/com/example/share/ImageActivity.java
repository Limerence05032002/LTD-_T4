package com.example.share;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.Toast;

import java.util.Collections;

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

        Collections.shuffle(MainActivity.arrayName);

        for (int i =1; i <=Sodong; i++){
            TableRow tableRow = new TableRow(this);

            for(int j = 1; j<= SoCot;j++){
                ImageView imageView = new ImageView(this);
                TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(180,180);
                imageView.setLayoutParams(layoutParams);

                int vitri = SoCot * (i - 1) + j - 1;

                int idHinh = getResources().getIdentifier(MainActivity.arrayName.get(vitri),"drawable", getPackageName());
                imageView.setImageResource(idHinh);
                tableRow.addView(imageView);

                imageView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent();
                        intent.putExtra("tenHinhChon", MainActivity.arrayName.get(vitri));
                        setResult(RESULT_OK, intent);
                        finish();
                    }
                });
            }
            myTable.addView(tableRow);
        }
    }
}
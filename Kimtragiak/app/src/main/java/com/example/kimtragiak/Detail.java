package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import Food.Food;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Bundle bundle = getIntent().getExtras();
        if (bundle == null){
            return;
        }

        Food food =(Food) bundle.get("Object food");

        TextView tvNameUser = findViewById(R.id.tv_name_user);
        tvNameUser.setText(food.getTitle());

        ImageView Image = findViewById(R.id.Image);
        Image.setImageResource(food.getSourceImage());

        TextView mota_food = findViewById(R.id.mota_food);
        mota_food.setText(food.getMota_food());

        TextView nl_food = findViewById(R.id.nl_food);
        nl_food.setText(food.getNl_food());

        TextView calo_food = findViewById(R.id.calo_food);
        calo_food.setText(food.getCalo_food());

        TextView dd_food = findViewById(R.id.dd_food);
        dd_food.setText(food.getDd_food());

        TextView gia_food = findViewById(R.id.gia_food);
        gia_food.setText(food.getGia_food());

        Button btnBack = findViewById(R.id.back);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackMenu();
            }
        });
    }

    private void BackMenu() {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }
}
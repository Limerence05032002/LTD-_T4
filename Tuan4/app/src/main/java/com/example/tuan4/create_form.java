package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class create_form extends AppCompatActivity {
    ImageView button_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_form);

        button_back = findViewById(R.id.button_back);
        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Back_home();
            }
        });
    }

    private void Back_home() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Login_form extends AppCompatActivity {
    ImageView back_home;
    Button button_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);

        back_home = findViewById(R.id.button_back);
        button_login = findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenProfile();
            }
        });

        back_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BackHome();
            }
        });
    }

    private void OpenProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    private void BackHome() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
        package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_Dangnhap,button_Dangki;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Dangnhap = findViewById(R.id.home_login);
        button_Dangki = findViewById(R.id.home_signUp);

        button_Dangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangKiForm();
            }
        });
        button_Dangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDangNhapForm();
            }
        });
    }

    private void openDangKiForm() {
        Intent intent = new Intent(this, create_form.class);
        startActivity(intent);
    }

    private void openDangNhapForm() {
        Intent intent = new Intent(this, Login_form.class);
        startActivity(intent);
    }
}
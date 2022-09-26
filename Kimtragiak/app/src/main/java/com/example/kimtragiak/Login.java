package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    TextView link_register;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = findViewById(R.id.btn_login);
        link_register = findViewById(R.id.link_register);
        link_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenRegister();
            }
        });
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });
    }

    private void openMenu() {
        Intent intent = new Intent(this, menu.class);
        startActivity(intent);
    }

    private void OpenRegister() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
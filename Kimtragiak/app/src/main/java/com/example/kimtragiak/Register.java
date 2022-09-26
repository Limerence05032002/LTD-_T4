package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Register extends AppCompatActivity {
    TextView link_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        link_login =findViewById(R.id.link_login);
        link_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenLogin();
            }
        });
    }

    private void OpenLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
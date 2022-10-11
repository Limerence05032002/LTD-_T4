package com.example.bai2_tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText user;
    private EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        user = findViewById(R.id.userName);
        pass = findViewById(R.id.passWord);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckPass();
                OpenProfile();
            }
        });
    }

    private void CheckPass() {

    }

    private void OpenProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}
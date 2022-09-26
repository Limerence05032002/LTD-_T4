package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button_getStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_getStart = findViewById(R.id.button_getStart);
        button_getStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Open();
            }
        });
    }

    private void Open() {
        Intent intent = new Intent(this,Login.class);
        startActivity(intent);
    }
}
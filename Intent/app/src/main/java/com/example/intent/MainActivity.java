package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText ten, tuoi, lop, SDT;
    Sinhvien sinhvien;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button1);
        ten = findViewById(R.id.ten);
        tuoi = findViewById(R.id.tuoi);
        lop = findViewById(R.id.lop);
        SDT = findViewById(R.id.SDT);

        ten.setText(sinhvien.getTen());
        tuoi.setText(sinhvien.getTuoi());
        lop.setText(sinhvien.getLop());
        SDT.setText(sinhvien.getSDT());


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                open();
            }
        });
    }

    private void open() {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("ten", (Parcelable) ten);

        startActivity(intent);

    }
}
package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private EditText editText1;
    private EditText editText2;
    private Button buttonKT;
    private TextView textViewNUMBER;
    private TextView textViewNOTE;

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Ánh xạ

        editText1 = findViewById(R.id.EditText1);
        editText2 = findViewById(R.id.EditText2);
        buttonKT = findViewById(R.id.buttonKT);
        textViewNUMBER = findViewById(R.id.textViewNUMBER);
        textViewNOTE = findViewById(R.id.textViewNOTE);


        buttonKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KiemtraSo();
            }
        });
    }

    private void KiemtraSo() {
        double canNang = Double.parseDouble(editText1.getText().toString().trim());
        double chieuCao = Double.parseDouble(editText2.getText().toString().trim());

        double tinh = canNang/((chieuCao/100)*(chieuCao/100));

        textViewNUMBER.setText(String.valueOf(tinh));


    }

}











package com.example.thuchanhktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    TextView link_login;
    EditText edtName,edtMail,edtPass;
    Button btnRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        link_login =findViewById(R.id.link_login);
        edtName = findViewById(R.id.edtName);
        edtMail = findViewById(R.id.edtMail);
        edtPass = findViewById(R.id.edtPass);
        btnRegis = findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMenu();
            }
        });

        link_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenLogin();
            }
        });
    }

    private void openMenu() {
        if(edtName.getText().length() != 0 && edtMail.getText().length() != 0 && edtPass.getText().length() != 0) {
            if (edtName.getText().toString().equals("TrungAnh") && edtMail.getText().toString().equals("TrungAnh@gmail.com") && edtPass.getText().toString().equals("123")) {
                Toast.makeText(Register.this,"Bạn đã đăng kí thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
            }
        }else {
            Toast.makeText(Register.this,"Bạn cần phải nhập đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }

    private void OpenLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
package com.example.thuchanhktgk;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    TextView link_register;
    EditText txt_email,txt_pass;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        txt_email = findViewById(R.id.txt_email);
        txt_pass = findViewById(R.id.txt_pass);

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
        if(txt_email.getText().length() != 0 && txt_pass.getText().length() != 0){
            if(txt_email.getText().toString().equals("TrungAnh") && txt_pass.getText().toString().equals("123")){
                Toast.makeText(Login.this, "Bạn đã đăng nhập thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, ViewFood.class);
                startActivity(intent);
            }else {
                Toast.makeText(Login.this, "Bạn đã đăng nhập sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(Login.this, "Bạn cần nhập đủ thông tin", Toast.LENGTH_SHORT).show();
        }

    }

    private void OpenRegister() {
        Intent intent = new Intent(this, Register.class);
        startActivity(intent);
    }
}
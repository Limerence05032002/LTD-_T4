package com.example.cuocduakithu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    SeekBar seekBar1,seekBar2,seekBar3;
    CheckBox checkBox1,checkBox2,checkBox3;
    TextView TextDiem;
    Button button, button2;
    int sodiem = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        seekBar1.setEnabled(false);
        seekBar2.setEnabled(false);
        seekBar3.setEnabled(false);
        TextDiem.setText(sodiem + "");
        CountDownTimer countDownTimer = new CountDownTimer(10000,300) {
            @Override
            public void onTick(long l) {
                int number = 5;
                Random random = new Random();
                int one = random.nextInt(number);
                int two = random.nextInt(number);
                int three = random.nextInt(number);

                seekBar1.setProgress(seekBar1.getProgress() + one);
                seekBar2.setProgress(seekBar2.getProgress() + two);
                seekBar3.setProgress(seekBar3.getProgress() + three);

                if (seekBar1.getProgress() >= seekBar1.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Chuột win", Toast.LENGTH_SHORT).show();
                    // kiem tra dat cuoc
                    if (checkBox1.isChecked()){
                        sodiem += 10;
                        Toast.makeText(MainActivity.this, "Mày được cộng 10 điểm", Toast.LENGTH_SHORT).show();
                    }else{
                        sodiem -= 5;
                        Toast.makeText(MainActivity.this, "Mày bị trừ 5 điểm", Toast.LENGTH_SHORT).show();
                    }
                    TextDiem.setText(sodiem + "");
                    EnableCheckbox();
                }
                //else
//                    if(seekBar1.getMax() == seekBar2.getMax() || seekBar1.getMax() == seekBar3.getMax() || seekBar3.getMax() == seekBar2.getMax()){
//                        sodiem = sodiem;
//                        Toast.makeText(MainActivity.this, "Tỉ số hòa", Toast.LENGTH_SHORT).show();
                //}
                if (seekBar2.getProgress() >= seekBar2.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Chim win", Toast.LENGTH_SHORT).show();
                    // kiem tra dat cuoc
                    if (checkBox2.isChecked()){
                        sodiem += 10;
                        Toast.makeText(MainActivity.this, "Mày được cộng 10 điểm", Toast.LENGTH_SHORT).show();
                    }else{
                        sodiem -= 5;
                        Toast.makeText(MainActivity.this, "Mày bị trừ 5 điểm", Toast.LENGTH_SHORT).show();
                    }
                    TextDiem.setText(sodiem + "");
                    EnableCheckbox();
                }
                if (seekBar3.getProgress() >= seekBar3.getMax()){
                    this.cancel();
                    Toast.makeText(MainActivity.this, "Cá mập win", Toast.LENGTH_SHORT).show();
                    // kiem tra dat cuoc
                    if (checkBox3.isChecked()){
                        sodiem += 10;
                        Toast.makeText(MainActivity.this, "Mày được cộng 10 điểm", Toast.LENGTH_SHORT).show();
                    }else{
                        sodiem -= 5;
                        Toast.makeText(MainActivity.this, "Mày bị trừ 5 điểm", Toast.LENGTH_SHORT).show();
                    }
                    TextDiem.setText(sodiem + "");
                    EnableCheckbox();
                }
            }

            @Override
            public void onFinish() {

            }
        };

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                seekBar1.setProgress(3);
                seekBar2.setProgress(3);
                seekBar3.setProgress(3);

                checkBox1.setChecked(false);
                checkBox2.setChecked(false);
                checkBox3.setChecked(false);

                button.setEnabled(true);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(checkBox1.isChecked() || checkBox2.isChecked() || checkBox3.isChecked()){
                    seekBar1.setProgress(3);
                    seekBar2.setProgress(3);
                    seekBar3.setProgress(3);
                    button.setEnabled(false);

                    countDownTimer.start();
                    DisableCheck();
                }
                else {
                    Toast.makeText(MainActivity.this, "Vui long dat cuoc", Toast.LENGTH_SHORT).show();
                }

            }
        });
        checkBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    // bo 2.3
                    checkBox2.setChecked(false);
                    checkBox3.setChecked(false);
                }
            }
        });
        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    // bo 2.3
                    checkBox1.setChecked(false);
                    checkBox3.setChecked(false);
                }
            }
        });
        checkBox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    // bo 2.3
                    checkBox2.setChecked(false);
                    checkBox1.setChecked(false);
                }
            }
        });
    }
    private void EnableCheckbox(){
        checkBox1.setEnabled(true);
        checkBox2.setEnabled(true);
        checkBox3.setEnabled(true);
    }
    private void DisableCheck(){
        checkBox1.setEnabled(false);
        checkBox2.setEnabled(false);
        checkBox3.setEnabled(false);
    }
    private void Anhxa() {
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3 = findViewById(R.id.seekBar3);
        TextDiem = findViewById(R.id.textView);
        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
    }
}
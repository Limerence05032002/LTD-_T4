package com.example.tuan4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Profile extends AppCompatActivity {
    ListView lvProfile;
    ArrayList<String> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        lvProfile = findViewById(R.id.lvProfile);
        arrayList = new ArrayList<>();

        arrayList.add("Trường Đại học Sư Phạm kỹ Thuật");
        arrayList.add("Ngành Công nghệ Thông tin");
        arrayList.add("Lớp 20T1");
        arrayList.add("Chưa có người yêu");
        arrayList.add("Đăng xuất");

        ArrayAdapter adapter = new ArrayAdapter(Profile.this, android.R.layout.simple_list_item_1, arrayList);
        lvProfile.setAdapter(adapter);
    }
}
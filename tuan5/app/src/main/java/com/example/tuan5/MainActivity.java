package com.example.tuan5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvThings;
    ArrayList<Things> thingArray;
    ThingAdapter adapter;
     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        anhxa();
        adapter = new ThingAdapter(this, R.layout.dongthing, thingArray);
         lvThings.setAdapter(adapter);
    }

    private void anhxa() {
         lvThings = findViewById(R.id.lv_things);

        thingArray.add(new Things("Sound Box", "Chúa tể âm nhạc, ông hoàng âm thanh", "1000", R.drawable.soundbox));
        thingArray.add(new Things("Sound Box", "Chúa tể âm nhạc, ông hoàng âm thanh", "1000", R.drawable.soundbox));
        thingArray.add(new Things("Sound Box", "Chúa tể âm nhạc, ông hoàng âm thanh", "1000", R.drawable.soundbox));
        thingArray.add(new Things("Sound Box", "Chúa tể âm nhạc, ông hoàng âm thanh", "1000", R.drawable.soundbox));
        thingArray.add(new Things("Sound Box", "Chúa tể âm nhạc, ông hoàng âm thanh", "1000", R.drawable.soundbox));

    }
}
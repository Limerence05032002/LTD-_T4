package com.example.thuchanhktgk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ViewFood extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    HomeFragment homeFragment = new HomeFragment();
    CartFragment cartFragment = new CartFragment();
    NotifiFragment notifiFragment = new NotifiFragment();
    SettingFragment settingFragment = new SettingFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_food);

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.Home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, homeFragment).commit();
                        return true;
                    case R.id.Cart:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, cartFragment).commit();
                        return true;
                    case R.id.Notification:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, notifiFragment).commit();
                        return true;
                    case R.id.Setting:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container, settingFragment).commit();
                        return true;
                }

                return false;
            }
        });
    }
}
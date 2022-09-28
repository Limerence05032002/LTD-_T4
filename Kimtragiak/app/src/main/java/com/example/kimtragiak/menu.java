package com.example.kimtragiak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import Food.Food;
import Food.FoodAdapter;


public class menu extends AppCompatActivity {
    private RecyclerView rcvCAtegory;
    private FoodAdapter mFoodAdapter;
    private ImageView profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        rcvCAtegory = findViewById(R.id.rcv_category);
        mFoodAdapter = new FoodAdapter(this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        rcvCAtegory.setLayoutManager(gridLayoutManager);

        mFoodAdapter.setData(this,getListFood());
        rcvCAtegory.setAdapter(mFoodAdapter);

        profile = findViewById(R.id.profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenProfile();
            }
        });
    }

    private void OpenProfile() {
        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    private List<Food> getListFood() {
        List<Food> list = new ArrayList<>();
        list.add(new Food("Nui lốc xoáy",R.drawable.monan_nui, R.drawable.star,"Nui là 1 từ tiếng Việt để chỉ các loại sợi mì có nguồn gốc từ phương Tây. Các loại nui phổ biến ở Việt Nam hiện nay là dạng mì ống, hình xoắn ... ","Năng lượng:  650 calo", "Calories:  130-150 cal/100g", "Dinh dưỡng:  Protein, Canxi, Sắt, Chất xơ, ...", "150.000 VND"));
        list.add(new Food("Tôm cháy tỏi",R.drawable.monan_tom, R.drawable.star,"Các món ăn làm từ tôm thì nhất định không được bỏ qua tôm chiên bơ tỏi đâu đấy. Với cách làm đơn giản nhưng lại đem đến hương vị thơm ngon béo ngậy.","Năng lượng:  550 calo", "Calories:  50 kcal/100g", "Dinh dưỡng:  Protein, Lipit, B12, Sắt ...", "170.000 VND"));
        list.add(new Food("Spaghetti vẹm",R.drawable.monan_spaghetti, R.drawable.star,"Spaghetti hay thường được gọi là mì Ý là 1 loại pasta sợi dài, nhỏ, hình tru. Nó là thực phẩm thiết yếu của nền ẩm thực Ý truyền thống. Spaghetti được làm từ bột mì xay.","Năng lượng:  680 calo", "Calories:  68 kcal/100g", "Dinh dưỡng:  Protein, Lipit, Tinh bột, ...", "250.000 VND"));
        list.add(new Food("Xôi gà ác",R.drawable.monan_xoi, R.drawable.star,"Xôi là đồ ăn thông dụng được làm từ nguyên liệu chính là gạo nếp, đồ/hấp chín bằng hơi nước, thịnh hành trong ẩm thực nhiều nước Châu Á. Nguyên liệu chính là các loại gạo nếp","Năng lượng:  420 calo", "Calories:  125 kcal/100g", "Dinh dưỡng:  Protein, Lipit, ...", "100.000 VND"));
        list.add(new Food("Ghẹ hấp củ",R.drawable.monan_ghe, R.drawable.star,"Ghẹ là một loại cua lớn tìm thấy ở các cửa sông của Ấn Độ Dương và Thái Bình Dương cũng như vùng duyên hải Trung - Đông của Địa Trung Hải. Loài Ghẹ này phân bố rộng rãi ở Việt Nam.","Năng lượng:  650 calo", "Calories:  111 kcal/100g", "Dinh dưỡng:  Protein, Canxi, Sắt, Sea, ...", "160.000 VND"));
        list.add(new Food("Beef Steak",R.drawable.monan_beef, R.drawable.star,"Món Beef Steak đúng nghĩa thường chỉ được phục vụ trong các nhà hàng loại sang trongj vì nguyên liệu thịt bò ở đây khá đắt đỏ. Món bò thường bị nhầm lẫn với bít tết là bò né.","Năng lượng:  750 calo", "Calories:  133,8 kcal/100g", "Dinh dưỡng:  Protein, lipit, B12, B6, ...", "180.000 VND"));


        return list;
    }

}
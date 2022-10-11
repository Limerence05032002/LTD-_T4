package com.example.thuchanhktgk;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends ArrayAdapter<Food> {
    private Context ct;
    private ArrayList<Food> arr;

    public ListAdapter(@NonNull Context context, int resource, @NonNull List<Food> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null){
            LayoutInflater i = (LayoutInflater) ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = i.inflate(R.layout.listfood, null);
        }
        if (arr.size() > 0){
            Food d = arr.get(position);
        }
        return convertView;
    }
}

//        ImageView imageFood = convertView.findViewById(R.id.image_food);
//        TextView tv_name_food = convertView.findViewById(R.id.tv_name_food);
//        TextView tv_des_food = convertView.findViewById(R.id.tv_des_food);
//        ImageView star1 = convertView.findViewById(R.id.star1);
//        ImageView star2 = convertView.findViewById(R.id.star2);
//        ImageView star3 = convertView.findViewById(R.id.star3);
//        ImageView star4 = convertView.findViewById(R.id.star4);
//        ImageView star5 = convertView.findViewById(R.id.star5);
//        TextView cost_food = convertView.findViewById(R.id.cost_food);
//        TextView viewOrder = convertView.findViewById(R.id.viewOrder);
//
//        imageFood.setImageResource(food.getSourceImage());
//        tv_name_food.setText(food.getTitle());
//        tv_des_food.setText(food.getMota_food());
//        star1.setImageResource(food.getSourceStar());
//        star2.setImageResource(food.getSourceStar());
//        star3.setImageResource(food.getSourceStar());
//        star4.setImageResource(food.getSourceStar());
//        star5.setImageResource(food.getSourceStar());
//        cost_food.setText(food.getGia_food());
//        viewOrder.setText(food.getNl_food());

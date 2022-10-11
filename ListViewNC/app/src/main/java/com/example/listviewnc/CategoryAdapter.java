package com.example.listviewnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {

    private Context mContext;
    private List<Category> mListCategory;

    public CategoryAdapter(Context mContext) {
        this.mContext = mContext;
    }

    public void setData(List<Category> list){
        this.mListCategory = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category, parent, false);
        return new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category = mListCategory.get(position);
        if (category == null){
            return ;
        }
        holder.tvNameCategory.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(mContext, RecyclerView.HORIZONTAL, false);
        holder.rcv_food.setLayoutManager(linearLayoutManager);

        FoodAdapter foodAdapter = new FoodAdapter();
        foodAdapter.setData(category.getFoods()); // set dữ liệu cho CategoryAdapter
        holder.rcv_food.setAdapter(foodAdapter);
    }

    @Override
    public int getItemCount() {
        if (mListCategory != null){
            return mListCategory.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNameCategory;
        private RecyclerView rcv_food;

        public CategoryViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNameCategory = itemView.findViewById(R.id.tv_name_category);
            rcv_food = itemView.findViewById(R.id.rcv_food);
        }
    }
}

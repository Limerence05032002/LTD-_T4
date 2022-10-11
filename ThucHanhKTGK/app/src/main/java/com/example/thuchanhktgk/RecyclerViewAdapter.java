package com.example.thuchanhktgk;

import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class RecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends RecyclerViewAdapter.MyViewHolder{

    }
}

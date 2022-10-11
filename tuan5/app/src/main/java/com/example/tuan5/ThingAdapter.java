package com.example.tuan5;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ThingAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Things> ThingList;

    public ThingAdapter(Context context, int layout, List<Things> thingList) {
        this.context = context;
        this.layout = layout;
        ThingList = thingList;
    }

    @Override
    public int getCount() {
        return ThingList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder {
        ImageView imgHinh;
        TextView Ten, Des, Count;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null){
            LayoutInflater ìnflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = ìnflater.inflate(layout, null);
            holder = new ViewHolder();

            // anhs xa view
            holder.Ten = view.findViewById(R.id.ten);
            holder.Des = view.findViewById(R.id.mota);
            holder.imgHinh = view.findViewById(R.id.image_hinh);
            holder.Count = view.findViewById(R.id.gia);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }

        // gan gia tri

        Things quocGia = ThingList.get(i);

        holder.Ten.setText(quocGia.getTen());
        holder.Des.setText(quocGia.getDecription());
        holder.Count.setText(quocGia.getCount());
        holder.imgHinh.setImageResource(quocGia.getHinh());


        return view;
    }
}

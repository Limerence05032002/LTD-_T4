package com.example.listviewnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class quocGiaAdapter extends BaseAdapter {

    private Context context;
    private int layout;
    private List<QuocGia> QuocGiaList;

    public quocGiaAdapter(Context context, int layout, List<QuocGia> quocGiaList) {
        this.context = context;
        this.layout = layout;
        QuocGiaList = quocGiaList;
    }

    @Override
    public int getCount() {
        return QuocGiaList.size()   ; // trả về số dòng muốn hiển thị
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imgHinh;
        TextView ten, mota;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;

        if (view == null){
            LayoutInflater ìnflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = ìnflater.inflate(layout, null);
            holder = new ViewHolder();

            // anhs xa view
            holder.ten = view.findViewById(R.id.TenQG);
            TextView DanSo = view.findViewById(R.id.Danso);
            holder.mota = view.findViewById(R.id.mota);
            holder.imgHinh = view.findViewById(R.id.image_hinh);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }



        // gan gia tri

        QuocGia quocGia = QuocGiaList.get(i);

        holder.ten.setText(quocGia.getTenQG());
        holder.mota.setText(quocGia.getMota());
        holder.imgHinh.setImageResource(quocGia.getHinh());


        return view;
    }
}

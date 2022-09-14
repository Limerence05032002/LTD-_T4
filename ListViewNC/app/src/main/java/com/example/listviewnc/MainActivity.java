package com.example.listviewnc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvQuocGia;
    ArrayList<QuocGia> quocGiaArray;
    quocGiaAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        anhxa();
        adapter = new quocGiaAdapter(this, R.layout.dong_qoucgia, quocGiaArray);
        lvQuocGia.setAdapter(adapter);
    }

    private void anhxa() {
        lvQuocGia = findViewById(R.id.list_View_QG);
        quocGiaArray = new ArrayList<>();

        quocGiaArray.add(new QuocGia("Việt Nam","Quốc gia chữ S", R.drawable.vietnam));
        quocGiaArray.add(new QuocGia("Trung Quốc","Quốc gia dân số", R.drawable.trung));
        quocGiaArray.add(new QuocGia("Lào","Quốc gia hàng xóm", R.drawable.lao));
        quocGiaArray.add(new QuocGia("Campuchia","Quốc gia láng giềng", R.drawable.cam));
        quocGiaArray.add(new QuocGia("Thái Lan","Sử sở triệu voi", R.drawable.thai));
        quocGiaArray.add(new QuocGia("Việt Nam","Quốc gia chữ S", R.drawable.vietnam));
        quocGiaArray.add(new QuocGia("Trung Quốc","Quốc gia dân số", R.drawable.trung));
        quocGiaArray.add(new QuocGia("Lào","Quốc gia hàng xóm", R.drawable.lao));
        quocGiaArray.add(new QuocGia("Campuchia","Quốc gia láng giềng", R.drawable.cam));
        quocGiaArray.add(new QuocGia("Thái Lan","Sử sở triệu voi", R.drawable.thai));
        quocGiaArray.add(new QuocGia("Việt Nam","Quốc gia chữ S", R.drawable.vietnam));
        quocGiaArray.add(new QuocGia("Trung Quốc","Quốc gia dân số", R.drawable.trung));
        quocGiaArray.add(new QuocGia("Lào","Quốc gia hàng xóm", R.drawable.lao));
        quocGiaArray.add(new QuocGia("Campuchia","Quốc gia láng giềng", R.drawable.cam));
        quocGiaArray.add(new QuocGia("Thái Lan","Sử sở triệu voi", R.drawable.thai));
        quocGiaArray.add(new QuocGia("Việt Nam","Quốc gia chữ S", R.drawable.vietnam));
        quocGiaArray.add(new QuocGia("Trung Quốc","Quốc gia dân số", R.drawable.trung));
        quocGiaArray.add(new QuocGia("Lào","Quốc gia hàng xóm", R.drawable.lao));
        quocGiaArray.add(new QuocGia("Campuchia","Quốc gia láng giềng", R.drawable.cam));
        quocGiaArray.add(new QuocGia("Thái Lan","Sử sở triệu voi", R.drawable.thai));
    }
}
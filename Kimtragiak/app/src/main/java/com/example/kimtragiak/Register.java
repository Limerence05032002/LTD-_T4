package com.example.kimtragiak;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class Register extends AppCompatActivity {
    TextView link_login;
    EditText edtName,edtMail,edtPass;
    Button btnRegis;
    @Overridelink_login =findViewById(R.id.link_login);
    edtName = findViewById(R.id.edtName);
    edtMail = findViewById(R.id.edtMail);
    edtPass = findViewById(R.id.edtPass);
    btnRegis = findViewById(R.id.btnRegis);

        btnRegis.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            openMenu();
        }
    });

        link_login.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            OpenLogin();
        }
    });
}

    private void openMenu() {
        if(edtName.getText().length() != 0 && edtMail.getText().length() != 0 && edtPass.getText().length() != 0) {
            if (edtName.getText().toString().equals("TrungAnh") && edtMail.getText().toString().equals("TrungAnh@gmail.com") && edtPass.getText().toString().equals("123")) {
                Toast.makeText(Register.this,"Bạn đã đăng kí thành công", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, Login.class);
                startActivity(intent);
            }
        }else {
            Toast.makeText(Register.this,"Bạn cần phải nhập đủ thông tin", Toast.LENGTH_SHORT).show();
        }
    }

    private void OpenLogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);





    //    private List<Food> mListFoods;
    //    private Context mContext;
    //
    //    public FoodAdapter(Context mContext){
    //        this.mContext = mContext;
    //    }
    //
    //    public FoodAdapter(Home_Fragment home_fragment) {
    //        this.mContext =
    //    }
    //
    //    public void setData(Context context, List<Food> list){
    //        this.mContext = context;
    //        this.mListFoods = list;
    //        notifyDataSetChanged(); // Hàm load/ bind dữ liệu lên FoodAdapter
    //    }
    //
    //    @NonNull
    //    @Override
    //    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    //        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
    //        return new FoodViewHolder(view);
    //    }
    //
    //    @Override
    //    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
    //        Food food = mListFoods.get(position);
    //        if (food == null){
    //            return;
    //        }
    //        holder.imageFood.setImageResource(food.getSourceImage());
    //        holder.tvTitle.setText(food.getTitle());
    //
    //        holder.layout_item.setOnClickListener(new View.OnClickListener() {
    //            @Override
    //            public void onClick(View view) {
    //                onClickGoToDetail(food);
    //            }
    //        });
    //
    //    }
    //
    //    private void onClickGoToDetail(Food food) {
    //        Intent intent = new Intent(mContext, Detail.class);
    //        Bundle bundle = new Bundle();
    //        bundle.putSerializable("Object food", food);
    //        intent.putExtras(bundle);
    //        mContext.startActivity(intent);
    //    }
    //
    //
    //    @Override
    //    public int getItemCount() {
    //        if (mListFoods != null){
    //            return mListFoods.size();
    //        }
    //        return 0;
    //    }
    //
    //    public class FoodViewHolder extends RecyclerView.ViewHolder {
    //
    //        private CardView layout_item;
    //        private ImageView imageFood;
    //        private ImageView star1,star2,star3,star4,star5;
    //        private TextView tvTitle;
    //
    //        public FoodViewHolder(@NonNull View itemView) {
    //            super(itemView);
    //
    //            // ánh xạ
    //            layout_item = itemView.findViewById(R.id.layout_item);
    //            imageFood = itemView.findViewById(R.id.img_beef);
    //            star1 = itemView.findViewById(R.id.icon_star1);
    //            star2 = itemView.findViewById(R.id.icon_star2);
    //            star3 = itemView.findViewById(R.id.icon_star3);
    //            star4 = itemView.findViewById(R.id.icon_star4);
    //            star5 = itemView.findViewById(R.id.icon_star5);
    //            tvTitle = itemView.findViewById(R.id.tv_title);
    //
    //
    //
    //        }
    //    }
    }
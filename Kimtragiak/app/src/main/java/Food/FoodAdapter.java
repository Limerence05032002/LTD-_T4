package Food;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kimtragiak.Detail;
import com.example.kimtragiak.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<Food> mListFoods;
    private Context mContext;

    public FoodAdapter(Context mContext){
        this.mContext = mContext;
    }

    public void setData(Context context, List<Food> list){
        this.mContext = context;
        this.mListFoods = list;
        notifyDataSetChanged(); // Hàm load/ bind dữ liệu lên FoodAdapter
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        Food food = mListFoods.get(position);
        if (food == null){
            return;
        }
        holder.imageFood.setImageResource(food.getSourceImage());
        holder.tvTitle.setText(food.getTitle());

        holder.layout_item.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(food);
            }
        });

    }

    private void onClickGoToDetail(Food food) {
        Intent intent = new Intent(mContext, Detail.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("Object food", food);
        intent.putExtras(bundle);
        mContext.startActivity(intent);
    }


    @Override
    public int getItemCount() {
        if (mListFoods != null){
            return mListFoods.size();
        }
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private CardView layout_item;
        private ImageView imageFood;
        private ImageView star1,star2,star3,star4,star5;
        private TextView tvTitle;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            // ánh xạ
            layout_item = itemView.findViewById(R.id.layout_item);
            imageFood = itemView.findViewById(R.id.img_beef);
            star1 = itemView.findViewById(R.id.icon_star1);
            star2 = itemView.findViewById(R.id.icon_star2);
            star3 = itemView.findViewById(R.id.icon_star3);
            star4 = itemView.findViewById(R.id.icon_star4);
            star5 = itemView.findViewById(R.id.icon_star5);
            tvTitle = itemView.findViewById(R.id.tv_title);



        }
    }
}

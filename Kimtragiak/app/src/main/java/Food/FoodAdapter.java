package Food;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.kimtragiak.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<Food> mFoods;
    
    public void setData(List<Food> list){
        this.mFoods = list;
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
        Food food = mFoods.get(position);
        if (food == null){
            return;
        }
        holder.imageFood.setImageResource(food.getSourceImage());
        holder.tvTitle.setText(food.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mFoods != null){
            return mFoods.size();
        }
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {

        private ImageView imageFood;
        private ImageView star1,star2,star3,star4,star5;
        private TextView tvTitle;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            // ánh xạ
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

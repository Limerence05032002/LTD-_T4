package com.example.th_recyclerview;

import android.hardware.lights.LightState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    private List<Book> mBook;

    public void setData(List<Book> list){
        this.mBook = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book,parent,false);
        return new BookViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        Book book = mBook.get(position);
        if (book == null){
            return;
        }

        holder.img_book.setImageResource(book.getResourceId());
        holder.tvNameBook.setText(book.getTitle());
    }

    @Override
    public int getItemCount() {
        if (mBook != null){
            return mBook.size();
        }
        return 0;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder {

        private ImageView img_book;
        private TextView tvNameBook;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);

            img_book = itemView.findViewById(R.id.img_book);
            tvNameBook = itemView.findViewById(R.id.tv_nameBook);

        }
    }
}

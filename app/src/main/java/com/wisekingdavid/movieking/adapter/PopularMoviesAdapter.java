package com.wisekingdavid.movieking.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.wisekingdavid.movieking.R;
import com.wisekingdavid.movieking.model.Category;

import java.util.List;

public class PopularMoviesAdapter extends RecyclerView.Adapter<PopularMoviesAdapter.PopularMoviesViewHolder> {

    private Context context;
    private List<Category> categoryList;

    public PopularMoviesAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
    }

    @NonNull
    @Override
    public PopularMoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PopularMoviesViewHolder(LayoutInflater.from(context).inflate(R.layout.popular_movies_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PopularMoviesViewHolder holder, int position) {
        holder.categoryName.setText(categoryList.get(position).getCategoryName());
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public class PopularMoviesViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName;

        public PopularMoviesViewHolder(@NonNull View itemView) {
            super(itemView);

            categoryName = itemView.findViewById(R.id.catTitle);
        }
    }
}

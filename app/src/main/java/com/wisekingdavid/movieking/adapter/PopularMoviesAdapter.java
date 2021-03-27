package com.wisekingdavid.movieking.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.wisekingdavid.movieking.CategoryActivity;
import com.wisekingdavid.movieking.R;
import com.wisekingdavid.movieking.model.Category;
import com.wisekingdavid.movieking.model.CategoryItem;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PopularMoviesAdapter extends RecyclerView.Adapter<PopularMoviesAdapter.PopularMoviesViewHolder> {

    private Context context;
    private List<Category> categoryList;
//    private ArrayList<Movie> arraylist;
//    private List<Movie> mData;


    public PopularMoviesAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
//        this.arraylist = new ArrayList<>();
//        this.arraylist.addAll(mData);

    }

    @NonNull
    @Override
    public PopularMoviesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PopularMoviesViewHolder(LayoutInflater.from(context).inflate(R.layout.popular_movies_row, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PopularMoviesViewHolder holder, int position) {
        holder.categoryName.setText(categoryList.get(position).getCategoryName());
        setCategoryListRecycler(holder.recyclerView, categoryList.get(position).getCategoryItemList());

        holder.seeAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, CategoryActivity.class);
                intent.putExtra("CatTitle", categoryList.get(position).getCategoryName());
//                holder.categoryName.setText(categoryList.get(position).getCategoryName());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    public class PopularMoviesViewHolder extends RecyclerView.ViewHolder{

        TextView categoryName, seeAll;
        RecyclerView recyclerView;

        public PopularMoviesViewHolder(@NonNull View itemView) {
            super(itemView);
            categoryName = itemView.findViewById(R.id.catTitle);
            seeAll = itemView.findViewById(R.id.seeAll);
            recyclerView = itemView.findViewById(R.id.catItemRecycler);
        }
    }

    private void setCategoryListRecycler(RecyclerView recyclerView, List<CategoryItem> categoryItems){
        CategoryItemRecyclerAdapter categoryItemRecyclerAdapter = new CategoryItemRecyclerAdapter(context, categoryItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false));
        recyclerView.setAdapter(categoryItemRecyclerAdapter);

    }


//    public void filterMovieList(String charText) {
//        charText = charText.toLowerCase(Locale.getDefault());
//        mData.clear();
//        if (charText.length() == 0) {
//            mData.addAll(arraylist);
//        } else {
//            for (Movie m: arraylist) {
//                if (m.getCategory().toLowerCase(Locale.getDefault()).contains(charText)) {
//                    mData.add(m);
//                }
//            }
//        }
//        notifyDataSetChanged();
//    }

}

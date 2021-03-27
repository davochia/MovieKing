package com.wisekingdavid.movieking.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.wisekingdavid.movieking.MovieActivity;
import com.wisekingdavid.movieking.R;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class RecycleViewMovieAdapter extends RecyclerView.Adapter<RecycleViewMovieAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> mData;
    private ArrayList<Movie> arraylist;

    public RecycleViewMovieAdapter(Context mContext, List<Movie> mData) {
        this.mContext = mContext;
        this.mData = mData;
        this.arraylist = new ArrayList<>();
        this.arraylist.addAll(mData);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_movie_item, parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.movie_tv_title.setText(mData.get(position).getTitle());
        holder.movie_image.setImageResource(mData.get(position).getPosterImage());


        //Click Listener for thumbnails
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, MovieActivity.class);
                intent.putExtra("Title", mData.get(position).getTitle());
                intent.putExtra("Description", mData.get(position).getDescription());
                intent.putExtra("Category", mData.get(position).getCategory());
                intent.putExtra("Image", mData.get(position).getPosterImage());
                intent.putExtra("Released", mData.get(position).getReleaseDate());
                intent.putExtra("Rating", mData.get(position).getRating());
                intent.putExtra("Favorite", mData.get(position).isFavorite());

                mContext.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView movie_tv_title;
        ImageView movie_image;

        CardView cardView;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            movie_tv_title = itemView.findViewById(R.id.movieTitle);
            movie_image = itemView.findViewById(R.id.movieImage);

            cardView = itemView.findViewById(R.id.favoriteCardView);
        }
    }

    // Filter function
    public void filter(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        mData.clear();
        if (charText.length() == 0) {
            mData.addAll(arraylist);
        } else {
            for (Movie m: arraylist) {
                if (m.getTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
                    mData.add(m);
                }
            }
        }
        notifyDataSetChanged();
    }


    public void filterMovieList(String charText) {
        charText = charText.toLowerCase(Locale.getDefault());
        mData.clear();
        if (charText.length() == 0) {
            mData.addAll(arraylist);
        } else {
            for (Movie m: arraylist) {
                if (m.getCategory().toLowerCase(Locale.getDefault()).contains(charText)) {
                    mData.add(m);
                }
            }
        }
        notifyDataSetChanged();
    }

}

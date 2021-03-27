package com.wisekingdavid.movieking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wisekingdavid.movieking.Data.MovieData;
import com.wisekingdavid.movieking.adapter.PopularMoviesAdapter;
import com.wisekingdavid.movieking.adapter.RecycleViewMovieAdapter;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CategoryActivity extends AppCompatActivity {
    RecycleViewMovieAdapter myMovieAdapter;
    TextView txtCat;
    List<Movie> movies;
    MovieData movieData = new MovieData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.favoriteButton);

        bottomNavigationView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.favoriteButton:
                        startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
                        overridePendingTransition(0,0);
                    return true;

                case R.id.popularButton:
                    startActivity(new Intent(getApplicationContext(), PopularMoviesActivity.class));
                    overridePendingTransition(0,0);
                    return true;

                case R.id.searchButton:
                    startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                    overridePendingTransition(0,0);
                    return true;
            }
            return false;
        });

        txtCat = findViewById(R.id.categoryMovies);
        String catName = getIntent().getStringExtra("CatTitle");
        txtCat.setText(catName);


        movies = movieData.addMovies();
        RecyclerView myRecycler = findViewById(R.id.catRecycleView);


        List<Movie> categoryMovies = new ArrayList<>();
        for (Movie movie: movies){
            if (movie.getCategory().toLowerCase().equals(catName.toLowerCase())){
                categoryMovies.add(movie);
            }
        }

        myMovieAdapter = new RecycleViewMovieAdapter(this, categoryMovies);
        myRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myRecycler.setAdapter(myMovieAdapter);
    }

}
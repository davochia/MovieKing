package com.wisekingdavid.movieking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.SearchView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wisekingdavid.movieking.Data.MovieData;
import com.wisekingdavid.movieking.adapter.RecycleViewMovieAdapter;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    RecycleViewMovieAdapter myMovieAdapter;
    SearchView searchView;
    List<Movie> movies;
    MovieData movieData = new MovieData();
    List<Movie> searchMovies;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.searchButton);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
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
//                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
//                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });


        movies = movieData.addMovies();
        RecyclerView myRecycler = findViewById(R.id.searchRecycleView);

        myMovieAdapter = new RecycleViewMovieAdapter(this, movies);
        myRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myRecycler.setAdapter(myMovieAdapter);

        searchView = findViewById(R.id.edxSearch);
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        String text = newText;
        myMovieAdapter.filter(text);
        return false;
    }

}
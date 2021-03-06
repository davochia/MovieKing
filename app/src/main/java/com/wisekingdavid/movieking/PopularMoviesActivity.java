package com.wisekingdavid.movieking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wisekingdavid.movieking.Data.MovieData;
import com.wisekingdavid.movieking.adapter.PopularMoviesAdapter;
import com.wisekingdavid.movieking.model.Category;
import com.wisekingdavid.movieking.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class PopularMoviesActivity extends AppCompatActivity {

    MovieData movieData = new MovieData();


    RecyclerView categoryRecycler;
    PopularMoviesAdapter popularMoviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_movies);

        // Navigation
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setSelectedItemId(R.id.popularButton);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.favoriteButton:
                        startActivity(new Intent(getApplicationContext(), FavoriteActivity.class));
                        overridePendingTransition(0,0);
                        return true;

                    case R.id.popularButton:
//                        startActivity(new Intent(getApplicationContext(), PopularMoviesActivity.class));
//                        overridePendingTransition(0,0);
                        return true;

                    case R.id.searchButton:
                        startActivity(new Intent(getApplicationContext(), SearchActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });

        List<Category> categoryList = movieData.addAllCategory();
        setPopularCategoryRecycler(categoryList);
    }


    private void setPopularCategoryRecycler(List<Category> categories){
        categoryRecycler = findViewById(R.id.popularMainRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        categoryRecycler.setLayoutManager(layoutManager);

        popularMoviesAdapter = new PopularMoviesAdapter(this, categories);
        categoryRecycler.setAdapter(popularMoviesAdapter);
    }
}
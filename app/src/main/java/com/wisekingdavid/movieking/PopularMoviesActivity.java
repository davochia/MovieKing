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
import com.wisekingdavid.movieking.adapter.PopularMoviesAdapter;
import com.wisekingdavid.movieking.model.Category;
import com.wisekingdavid.movieking.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class PopularMoviesActivity extends AppCompatActivity {


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


        List<CategoryItem> actionList = new ArrayList<>();
        actionList.add(new CategoryItem(1, R.drawable.action));
        actionList.add(new CategoryItem(1, R.drawable.blade));
        actionList.add(new CategoryItem(1, R.drawable.mib));
        actionList.add(new CategoryItem(1, R.drawable.rocky));
        actionList.add(new CategoryItem(1, R.drawable.tombraider));
        actionList.add(new CategoryItem(1, R.drawable.star_trek));
        actionList.add(new CategoryItem(1, R.drawable.startwars));


        List<CategoryItem> dramaList = new ArrayList<>();
        dramaList.add(new CategoryItem(1, R.drawable.godfather));
        dramaList.add(new CategoryItem(1, R.drawable.trechery));
        dramaList.add(new CategoryItem(1, R.drawable.daddydaycare));
        dramaList.add(new CategoryItem(1, R.drawable.rocky));


        List<CategoryItem> scifiList = new ArrayList<>();
        scifiList.add(new CategoryItem(1, R.drawable.mib));
        scifiList.add(new CategoryItem(1, R.drawable.startwars));
        scifiList.add(new CategoryItem(1, R.drawable.star_trek));
        scifiList.add(new CategoryItem(1, R.drawable.tombraider));


        List<CategoryItem> comedyList = new ArrayList<>();
        comedyList.add(new CategoryItem(1, R.drawable.mrbean));
        comedyList.add(new CategoryItem(1, R.drawable.momsnightout));
        comedyList.add(new CategoryItem(1, R.drawable.daddydaycare));

        List<CategoryItem> horrorList = new ArrayList<>();
        horrorList.add(new CategoryItem(1, R.drawable.alive));
        horrorList.add(new CategoryItem(1, R.drawable.blade));
        horrorList.add(new CategoryItem(1, R.drawable.halloweenmovies));
        horrorList.add(new CategoryItem(1, R.drawable.hunted));
        horrorList.add(new CategoryItem(1, R.drawable.it));
        horrorList.add(new CategoryItem(1, R.drawable.scarymovies));
        horrorList.add(new CategoryItem(1, R.drawable.halloweenmovies));





        // Vertical category
        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Comedy", comedyList));
        categoryList.add(new Category("Drama", dramaList));
        categoryList.add(new Category("Action", actionList));
        categoryList.add(new Category("Sci-fi", scifiList));
        categoryList.add(new Category("Horror", horrorList));

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
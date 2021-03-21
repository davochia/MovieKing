package com.wisekingdavid.movieking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.wisekingdavid.movieking.adapter.PopularMoviesAdapter;
import com.wisekingdavid.movieking.model.Category;

import java.util.ArrayList;
import java.util.List;

public class PopularMoviesActivity extends AppCompatActivity {


    RecyclerView categoryRecycler;
    PopularMoviesAdapter popularMoviesAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popular_movies);


        List<Category> categoryList = new ArrayList<>();
        categoryList.add(new Category("Top Pre-Orders"));
        categoryList.add(new Category("Top Movies"));
        categoryList.add(new Category("New & Noteworthy"));
        categoryList.add(new Category("Top Free"));
        categoryList.add(new Category("Action"));
        categoryList.add(new Category("New To Rent"));

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
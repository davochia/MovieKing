package com.wisekingdavid.movieking;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wisekingdavid.movieking.adapter.RecycleViewMovieAdapter;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {

    List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //will hide the title
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getSupportActionBar().hide();
//        //enable full screen
//        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_favorite);

        movies = new ArrayList<>();
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Action", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Drama", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Thriller", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Sci-Fi", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Kids and Family", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Sci-Fi", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));

        RecyclerView myRecycler = findViewById(R.id.recycleViewId);

        List<Movie> favorites = new ArrayList<>();
        for (Movie movie: movies){
            if (movie.isFavorite()){
                favorites.add(movie);
            }
        }

        RecycleViewMovieAdapter myMovieAdapter = new RecycleViewMovieAdapter(this, favorites);
        myRecycler.setLayoutManager(new GridLayoutManager(this, 2));
        myRecycler.setAdapter(myMovieAdapter);


//        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
//        bottomNavigationView.setSelectedItemId(R.id.favoriteButton);

//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.popularButton:
////                        startActivity(new Intent(getApplicationContext()));
//                }
//                return false;
//            }
//        });

    }
}
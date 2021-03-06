package com.wisekingdavid.movieking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MovieActivity extends AppCompatActivity {

    private TextView txtTitle, txtReleased, txtDescription, txtCategory, rRating;
    private ImageView posterImage;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

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



        txtTitle = findViewById(R.id.detailsTitle);
        txtReleased = findViewById(R.id.detailsRelease);
        txtDescription = findViewById(R.id.detailsDescription);
        txtCategory = findViewById(R.id.detailsCategory);
        posterImage = findViewById(R.id.detailsImage);
        rRating = findViewById(R.id.detailsRating);
        checkBox = findViewById(R.id.detailsFavorite);


        Intent intent = getIntent();
        String movieTitle = intent.getExtras().getString("Title");
        String description = intent.getExtras().getString("Description");
        String cat = intent.getExtras().getString("Category");
        int image = intent.getExtras().getInt("Image");
        String released = intent.getExtras().getString("Released");
        int rating = intent.getExtras().getInt("Rating");
        boolean favorite = intent.getExtras().getBoolean("Favorite");

        txtTitle.setText(movieTitle);
        txtDescription.setText(description);
        txtCategory.setText(cat);
        txtReleased.setText(new StringBuilder().append("Released: ").append(released).toString());
        posterImage.setImageResource(image);
        rRating.setText(new StringBuilder().append("|  Rating: ").append(rating).toString());
        checkBox.setChecked(favorite);


    }
}
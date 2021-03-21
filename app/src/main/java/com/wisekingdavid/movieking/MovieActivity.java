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


public class MovieActivity extends AppCompatActivity {

    private TextView txtTitle, txtReleased, txtDescription, txtCategory, rRating;
    private ImageView posterImage;
//    private RatingBar rRating;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);



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
        txtReleased.setText(released);
        posterImage.setImageResource(image);
        rRating.setText(new StringBuilder().append("Rating: ").append(rating).toString());
        checkBox.setChecked(favorite);


    }
}
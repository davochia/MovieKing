package com.wisekingdavid.movieking;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        BottomNavigationView bottomNavigationView;
//        bottomNavigationView = findViewById(R.id.bottom_navigation);
//
//
//
//        bottomNavigationView.setOnNavigationItemSelectedListener(MenuItem item);
//        bottomNavigationView.setSelectedItemId(R.id.my_menu_item_id);









//        BottomNavigationView navView = findViewById(R.id.bottom_navigation);
//
//        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
//                R.id.popularButton, R.id.favoriteButton, R.id.searchButton )
//                .build();
//
//        //Initialize NavController.
//        NavController navController = Navigation.findNavController(this, R.id.navigationView);
//        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
//        NavigationUI.setupWithNavController(navView, navController);

    }
}
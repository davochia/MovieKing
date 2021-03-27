package com.wisekingdavid.movieking.Data;

import com.wisekingdavid.movieking.R;
import com.wisekingdavid.movieking.model.Category;
import com.wisekingdavid.movieking.model.CategoryItem;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MovieData {
    List<Movie> movies;

    String mDescrption = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.";

    public List<Movie> addMovies(){
        movies = new ArrayList<>();

        movies.add(new Movie("Blade", "Action", R.drawable.blade, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("MIB", "Action", R.drawable.mib, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Daddy Day Care", "Comedy", R.drawable.daddydaycare, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Action Movie", "Action", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Star Trek", "Sci-Fi", R.drawable.star_trek, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("The God Father", "Drama", R.drawable.godfather, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Blade", "Horror", R.drawable.blade, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Mons Night Out", "Comedy", R.drawable.momsnightout, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Action Movie", "Action", R.drawable.action, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Star Trek", "Action", R.drawable.star_trek, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Star Wars", "Action", R.drawable.startwars, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Treachery", "Drama", R.drawable.trechery, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Halloween movies", "Horror", R.drawable.halloweenmovies, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Thriller", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Tomb Raider", "Sci-Fi", R.drawable.tombraider, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Hunted", "Horror", R.drawable.hunted, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Daddy Day Care", "Drama", R.drawable.daddydaycare, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("MIB", "Sci-Fi", R.drawable.mib, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Rocky", "Action", R.drawable.rocky, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Tomb Raider", "Action", R.drawable.tombraider, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Kids and Family", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("It", "Horror", R.drawable.it, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Rocky", "Drama", R.drawable.rocky, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Blade", "Action", R.drawable.blade, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("MIB", "Action", R.drawable.mib, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, mDescrption, "23/05/2018", 5, true));
        movies.add(new Movie("Star Wars", "Sci-Fi", R.drawable.startwars, mDescrption, "23/05/2018", 5, false));
        movies.add(new Movie("Mr. Bean", "Comedy", R.drawable.mrbean, mDescrption, "23/05/2018", 5, true));

        return movies;
    }



    public List<Category> addAllCategory(){
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

        return categoryList;
    }
    
}

package com.wisekingdavid.movieking.Data;

import com.wisekingdavid.movieking.R;
import com.wisekingdavid.movieking.model.Movie;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MovieData {
    List<Movie> movies;


    public List<Movie> addMovies(){
        movies = new ArrayList<>();

        movies.add(new Movie("Blade", "Action", R.drawable.blade, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("MIB", "Action", R.drawable.mib, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Daddy Day Care", "Comedy", R.drawable.daddydaycare, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Action Movie", "Action", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Star Trek", "Sci-Fi", R.drawable.star_trek, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("The God Father", "Drama", R.drawable.godfather, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Blade", "Horror", R.drawable.blade, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Drama", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Mons Night Out", "Comedy", R.drawable.momsnightout, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Action Movie", "Action", R.drawable.action, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Star Trek", "Action", R.drawable.star_trek, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Star Wars", "Action", R.drawable.startwars, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Treachery", "Drama", R.drawable.trechery, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Halloween movies", "Horror", R.drawable.halloweenmovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Thriller", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Tomb Raider", "Sci-Fi", R.drawable.tombraider, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Hunted", "Horror", R.drawable.hunted, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Daddy Day Care", "Drama", R.drawable.daddydaycare, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("MIB", "Sci-Fi", R.drawable.mib, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Rocky", "Action", R.drawable.rocky, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Tomb Raider", "Action", R.drawable.tombraider, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Kids and Family", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("It", "Horror", R.drawable.it, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Rocky", "Drama", R.drawable.rocky, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Scarry Movie", "Romance", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Blade", "Action", R.drawable.blade, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("MIB", "Action", R.drawable.mib, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Scarry Movie", "Horror", R.drawable.scarymovies, "Movie Description", "23/05/2018", 5, true));
        movies.add(new Movie("Star Wars", "Sci-Fi", R.drawable.startwars, "Movie Description", "23/05/2018", 5, false));
        movies.add(new Movie("Mr. Bean", "Comedy", R.drawable.mrbean, "Movie Description", "23/05/2018", 5, true));

        return movies;
    }


    // Filter Class
//    public void filter(String charText, List<Movie> searchMovie) {
//        charText = charText.toLowerCase(Locale.getDefault());
//        for (Movie m: this.movies) {
//            if (m.getTitle().toLowerCase(Locale.getDefault()).contains(charText)) {
//                searchMovie.add(m);
//            }
//
//        }
//    }
}

package com.wisekingdavid.movieking.model;

public class Movie {
    String title;
    String category;
    int posterImage;
    String description;
    String releaseDate;
    int rating;
    boolean favorite ;


    public Movie(){}

    public Movie(String title, String category, int posterImage, String description, String releaseDate, int rating, boolean favorite) {
        this.title = title;
        this.category = category;
        this.posterImage = posterImage;
        this.description = description;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.favorite = favorite;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPosterImage() {
        return posterImage;
    }

    public void setPosterImage(int posterImage) {
        this.posterImage = posterImage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favorite) {
        this.favorite = favorite;
    }
}

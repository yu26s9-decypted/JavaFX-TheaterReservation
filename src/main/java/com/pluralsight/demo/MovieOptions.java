package com.pluralsight.demo;

public class MovieOptions {

    private String movieName;
    private double moviePrice;

    public MovieOptions(String movieName, double moviePrice){
        this.movieName = movieName;
        this.moviePrice = moviePrice;


    }

    @Override
    public String toString(){
        return movieName.toString() + " - Retail Price: " + moviePrice;

    }
    public String getMovieName() {
        return movieName;
    }

    public double getMoviePrice(){
        return moviePrice;
    }
}

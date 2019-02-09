package com.twu.biblioteca;

public class Movie {
    String title;
    int year;
    String director;
    int rating;
    boolean checkedOut;

    Movie(String title, int year, String director, int rating, boolean checkedOut){
        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkedOut = checkedOut;
    }
}

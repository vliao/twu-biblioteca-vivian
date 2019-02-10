package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieShelf {
    private List<Movie> movies = new ArrayList<Movie>();

//    public MovieShelf(){
//        movies.add(new Movie("Up", 2009 , "Pete Doctor", 10 , false));
//        movies.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
//    }

    public MovieShelf(List<Movie> movies){
        this.movies = movies;
    }

    public String listMovies() {
        String movielist = "";
        for (Movie m : movies){
         movielist+= m.title + " | " + m.year + " | " + m.director + " | " + m.rating + " | " + m.checkedOut +"\n";
        }

        return movielist;
    }

    public String checkout(String title){
        Iterator<Movie> it = movies.iterator();
        String response = "Sorry, that book is unavailable";
        while(it.hasNext()) {
            Movie m = it.next();
            if (m.title.equals(title) && m.checkedOut ==false) {
                m.checkedOut = true;
                response = "Thank you! Enjoy the movie!";
                return response;
            }
        }
        return response;
    }

//    MovieShelf(){
//        movies.add(new Movie("Up", false));
//        movies.add(new Movie("Moana", false))
//    }
//    MovieShelf(List<Movie> movies){
//        this.movies = movies;
//    }
}

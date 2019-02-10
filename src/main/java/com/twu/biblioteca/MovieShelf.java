package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MovieShelf {
    private List<Movie> movies = new ArrayList<Movie>();

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

    public String checkoutMovie(String title){
        Iterator<Movie> it = movies.iterator();
        String response = "Sorry, that movie is unavailable";
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
}

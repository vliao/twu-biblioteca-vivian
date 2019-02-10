package com.twu.biblioteca;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieShelfTest {
    MovieShelf shelf;
    @Before
    public void initialize(){
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Up", 2009 , "Pete Doctor", 10 , false));
        movies.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
        shelf = new MovieShelf(movies);
    }
    @Test
    public void shouldSeeMovieList(){
        String movieList = shelf.listMovies();

        String expectedList = "Up | 2009 | Pete Doctor | 10 | false\n" +
                "Moana | 2016 | Ron Clements | 10 | false\n";

        assertThat(movieList, is(expectedList));
    }

    @Test
    public void shouldCheckoutMovie(){
        shelf.checkout("Up");

        List<Movie> after = new ArrayList<Movie>();
        after.add(new Movie("Up", 2009 , "Pete Doctor", 10 , true));
        after.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
        MovieShelf afterCheckout = new MovieShelf(after) ;

        MatcherAssert.assertThat(shelf.listMovies(), is(afterCheckout.listMovies()));
    }
}

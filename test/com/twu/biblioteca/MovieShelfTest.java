package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class MovieShelfTest {
    @Test
    public void shouldSeeMovieList(){
        MovieShelf shelf = new MovieShelf();
        String movieList = shelf.listMovies();

        String expectedList = "";

        assertThat(movieList, is(expectedList));
    }
}

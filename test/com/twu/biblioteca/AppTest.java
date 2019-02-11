package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;



public class AppTest {
    BookShelf shelf;
    MovieShelf movieShelf;
    Menu menu;

    @Before
    public void initialize(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        shelf = new BookShelf(books);

        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Up", 2009 , "Pete Doctor", 10 , false));
        movies.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
        movieShelf = new MovieShelf(movies);
    }

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();

    @Test
    public void shouldContinueUntilQuitOption(){
        Librarian l = new Librarian();
        //check whether the system exits after one. should only exit after quit option chosen.
        exit.expectSystemExitWithStatus(0); //main terminates peacefully
        l.processOption( 1);
        l.processOption(8);
    }

}

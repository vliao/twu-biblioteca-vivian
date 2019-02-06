package com.twu.biblioteca;


import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExampleTest {

    BibliotecaApp app;
    @Before
    public void initializeBiblioteca(){
        app = new BibliotecaApp();
    }

    @Test

    public void shouldReturnWelcome() {
        //upon starting the application, the message should return a welcome message

        String message = app.welcome();
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertThat(message, is(expectedMessage));
    }

    @Test
    public void shouldListAllBooks(){
        List<String> books = new ArrayList<String>();
        books.add("The Great Gatsby");
        books.add("Ender's Game");
        List<String> booksresult= app.listBooks(books);
        assertThat(booksresult, is(books));

    }

    @Test
    public void shouldShowAuthorPublication(){
        List<String> books = new ArrayList<String>();
        books.add("The Great Gatsby | F. Scott Fitzgerald | 1925");
        books.add("Ender's Game | Orson Scott Card | 1985");

        List<String> booksresult= app.listBooks(books);
        assertThat(booksresult, is(books));
    }

    @Test
    public void shouldSeeMenu(){
        String expectedMenu = "Here are your options: \n" +
               "1. List all books";

        assertThat(app.showMenuMessage(), is(expectedMenu));
    }

}

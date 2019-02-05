package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test

    public void shouldReturnWelcome() {
        //upon starting the application, the message should return a welcome message

        BibliotecaApp app = new BibliotecaApp();
        String message = app.welcome();
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertThat(message, is(expectedMessage));
    }

    @Test
    public void shouldListAllBooks(){
        List<String> books = new ArrayList<String>();
        books.add("The Great Gatsby");
        books.add("Ender's Game");
        BibliotecaApp app = new BibliotecaApp();
        List<String> booksresult= app.listBooks(books);
        assertThat(booksresult, is(books));

    }

}

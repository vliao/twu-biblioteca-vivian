package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ListBooksTest {
    @Test
    public void shouldShowAuthorPublication(){
        List<String> books = new ArrayList<String>();
        books.add("The Great Gatsby | F. Scott Fitzgerald | 1925");
        books.add("Ender's Game | Orson Scott Card | 1985");

        List<String> booksresult= ListBooks.listBooks();
        assertThat(booksresult, is(books));
    }
}

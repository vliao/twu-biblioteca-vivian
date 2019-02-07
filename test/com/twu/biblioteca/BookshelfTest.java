package com.twu.biblioteca;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookshelfTest {
    @Test
    public void shouldShowBooks(){
        String expectedBooks = "The Great Gatsby | F. Scott Fitzgerald | 1925 | false \n" +
                        "Ender's Game | Orson Scott Card | 1985 | false \n" ;
        BookShelf shelf = new BookShelf();
        String booksresult= shelf.listBooks();
        assertThat(booksresult, is(expectedBooks));
    }

    @Test
    public void shouldCheckoutBook(){
        BookShelf bookshelf = new BookShelf();
        System.out.println(bookshelf.listBooks());
        bookshelf.checkout("The Great Gatsby");
        System.out.println(bookshelf.listBooks());

        List<Book> after = new ArrayList<Book>();
        after.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", true));
        after.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        BookShelf afterCheckout = new BookShelf(after) ;

        MatcherAssert.assertThat(bookshelf.listBooks(), is(afterCheckout.listBooks()));
    }
}

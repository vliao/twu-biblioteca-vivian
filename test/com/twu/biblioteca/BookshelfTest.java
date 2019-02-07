package com.twu.biblioteca;

import org.hamcrest.MatcherAssert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BookshelfTest {
    @Test
    public void shouldShowAuthorPublication(){
        String expectedBooks = "The Great Gatsby | F. Scott Fitzgerald | 1925 \n " +
                        "Ender's Game | Orson Scott Card | 1985 \n " ;

        BookShelf shelf = new BookShelf();
        String booksresult= shelf.listBooks();

        assertThat(booksresult, is(expectedBooks));
    }

    @Test
    public void shouldCheckoutBook(){
        BookShelf bookshelf = new BookShelf();
        System.out.println(bookshelf.listBooks());
        bookshelf.checkout(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925"));
        System.out.println(bookshelf.listBooks());


        List<Book> after = new ArrayList<Book>();
        after.add(new Book("Ender's Game","Orson Scott Card", "1985"));
        BookShelf afterCheckout = new BookShelf(after) ;

        MatcherAssert.assertThat(bookshelf.listBooks(), is(afterCheckout.listBooks()));
    }
}

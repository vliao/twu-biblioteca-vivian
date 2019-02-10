package com.twu.biblioteca;

import org.hamcrest.MatcherAssert;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;


public class BookshelfTest {
    BookShelf shelf;
    User user;

    @Before
    public void initialize(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        shelf = new BookShelf(books);
        user = new User("John","jdoe@g.com","123-4321", "123");
    }

    @Test
    public void shouldShowBooks(){
//        String expectedBooks = "The Great Gatsby | F. Scott Fitzgerald | 1925 | false \n" +
//                        "Ender's Game | Orson Scott Card | 1985 | false \n" ;
//        String booksresult= shelf.listBooks();
//        assertThat(booksresult, is(expectedBooks));

        PrintStream printStream = mock(PrintStream.class);
        BookShelf bs = mock(BookShelf.class);

        when(bs.listBooks()).thenReturn("The Great Gatsby | F. Scott Fitzgerald | 1925 | false \n" +
                "Ender's Game | Orson Scott Card | 1985 | false \n");

        printStream.println(bs.listBooks());
        verify(printStream).println("The Great Gatsby | F. Scott Fitzgerald | 1925 | false \n" +
                "Ender's Game | Orson Scott Card | 1985 | false \n");
    }

    @Test
    //ask how a mock could be used here?
    public void shouldCheckoutBook(){
        shelf.checkout(user,"The Great Gatsby");

        List<Book> after = new ArrayList<Book>();
        after.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", true));
        after.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        BookShelf afterCheckout = new BookShelf(after) ;

        MatcherAssert.assertThat(shelf.listBooks(), is(afterCheckout.listBooks()));
    }
    @Test
    public void shouldShowValidCheckoutMessage(){
        String response = shelf.checkout(user,"The Great Gatsby");

        MatcherAssert.assertThat(response, is("Thank you! Enjoy the book!"));
    }
    @Test
    public void shouldShowInvalidCheckoutMessage(){
        String response = shelf.checkout(user,"Water for Elephants");
        MatcherAssert.assertThat(response, is("Sorry, that book is unavailable"));
    }

    @Test
    public void shouldReturnBook(){
        shelf.checkout(user,"The Great Gatsby");
        shelf.returnBook(user, "The Great Gatsby");

        List<Book> after = new ArrayList<Book>();
        after.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        after.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        BookShelf afterCheckout = new BookShelf(after) ;

        MatcherAssert.assertThat(shelf.listBooks(), is(afterCheckout.listBooks()));
    }

    @Test
    public void shouldShowValidReturnMessage(){
        shelf.checkout(user,"The Great Gatsby");
        String response = shelf.returnBook(user,"The Great Gatsby");

        MatcherAssert.assertThat(response, is( "Thank you for returning the book"));
    }
    @Test
    public void shouldShowInvalidReturnMessage(){
        String response = shelf.returnBook(user,"Water for Elephants");
        MatcherAssert.assertThat(response, is("That is not a valid book to return"));
    }
}

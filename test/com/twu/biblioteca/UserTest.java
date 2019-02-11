package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;


public class UserTest {
    BibliotecaApp app;
    User user;

    @Before
    public void initialize(){
        app = new BibliotecaApp();
        user = new User("Vivian",  "vvn@yahoo.com", "123-1234", "123");

    }

    @Test
    public void shouldGetUserName(){
        assertThat(user.getName(), is("Vivian"));
    }

    @Test
    public void shouldGetUserEmail(){
        assertThat(user.getEmail(), is("vvn@yahoo.com"));
    }

    @Test
    public void shouldGetUserNumber(){
        assertThat(user.getNumber(), is("123-1234"));
    }

    @Test
    public void shouldShowAllInfo(){
        String info = user.showInfo();
        String expectedInfo = "Vivian | vvn@yahoo.com | 123-1234";
        assertThat(info, is(expectedInfo));
    }

    @Test
    public void shouldShowOneBookCheckedOut(){
        String title = "The Great Gatsby";
        app.getLibrary().getBookshelf().checkout(user,title);
        String titles= user.showBooks();
        String usersTitles="The Great Gatsby\n";
        assertThat(usersTitles, is(titles));
    }

    @Test
    public void shouldShowTwoBooksCheckedOut(){
        String title = "The Great Gatsby";
        app.getLibrary().getBookshelf().checkout(user,title);
        title = "Ender's Game";
        app.getLibrary().getBookshelf().checkout(user,title);
        String titles= user.showBooks();
        String usersTitles="The Great Gatsby\nEnder's Game\n";
        assertThat(usersTitles, is(titles));
    }

    @Test
    public void shouldShowNoBooksIfReturned(){
        String title = "The Great Gatsby";
        app.getLibrary().getBookshelf().checkout(user,title);
        app.getLibrary().getBookshelf().returnBook(user,title);

        String titles= user.showBooks();
        String usersTitles="";
        assertThat(titles, is(usersTitles));
    }

}

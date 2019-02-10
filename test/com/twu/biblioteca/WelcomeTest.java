package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class WelcomeTest {
    Welcome start;
    BibliotecaApp app;
    List<User> users;
    @Before
    public void setUp(){
        start = new Welcome();
        app = new BibliotecaApp();
        users = new ArrayList<User>();
        users.add(new User( "John","jdoe@g.com", "123-1234", "123" ));
        app.setUsers(users);
    }

    @Test
    public void shouldReturnWelcome() {
        String message = start.welcome();
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        assertThat(message, is(expectedMessage));
    }

    @Test
    public void shouldValidateUser(){
      //  User u = new User("John","jdoe@g.com","123-1234", "123");
        boolean valid = start.validateUser("123-1234", "123", users);
        assertThat(valid, is(true));
    }

    @Test
    public void shouldNotValidateUser(){
       // User u = new User("John","jdoe@g.com","123-1234", "321");
        boolean valid = start.validateUser("123-1234", "321", users);
        assertThat(valid, is(false));
    }
}

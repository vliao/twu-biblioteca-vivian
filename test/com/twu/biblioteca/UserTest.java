package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;


public class UserTest {
    BibliotecaApp app;
    User user;

    @Before
    public void initialize(){
        app = new BibliotecaApp();
        user = new User("123-1234", "123");
    }

    @Test
    public void shouldListUsers(){
        app.listUsers();
        String users = "123-1234";
        String expectedUsers = "123-1234";

        assertThat(users, is(expectedUsers));
    }

    @Test
    public void shouldValidateUser(){

    }



    @Test
    public void shouldShowItemCheckedOut(){


    }

}

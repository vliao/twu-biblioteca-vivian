package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ShowWelcomeTest {
    @Test

    public void shouldReturnWelcome() {
        //upon starting the application, the message should return a welcome message

        String message = Welcome.welcome();
        String expectedMessage = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";

        assertThat(message, is(expectedMessage));
    }


}

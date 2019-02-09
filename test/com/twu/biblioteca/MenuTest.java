package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    @Test
    public void shouldSeeMenu(){
        String expectedMenu = "Here are your options: \n" +
                "1. List all books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. List all movies \n" +
                "5. Checkout a movie \n" +
                "6. Quit";
        assertThat(Menu.showMenuMessage(), is(expectedMenu));
    }

    @Test
    public void shouldNotifyInvalidOption(){
        String invalidOption = "";
    }
}

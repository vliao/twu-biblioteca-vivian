package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MenuTest {

    @Test
    public void shouldSeeMenu(){
        String expectedMenu = "Here are your options: \n" +
                "1. List all books \n" +
                "2. do something else \n " +
                "3. quit" ;
        assertThat(Menu.showMenuMessage(), is(expectedMenu));
    }
}

package com.twu.biblioteca;


import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.ExpectedSystemExit;


public class AppTest {

    @Rule
    public final ExpectedSystemExit exit = ExpectedSystemExit.none();


    @Test
    public void shouldContinueUntilQuitOption(){
        BookShelf b = new BookShelf();
        //check whether the system exits after one. should only exit after quit option chosen.
        exit.expectSystemExitWithStatus(0); //main terminates peacefully
        Menu.processOption(b, 1);
        Menu.processOption(b, 4); //option 3 correlates to quit.
    }

}
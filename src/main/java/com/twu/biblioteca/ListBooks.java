package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class ListBooks {
    //initialize bookslist
    private static List<String> books = new ArrayList<String>();

    public static List<String> listBooks() {
        books.add("The Great Gatsby | F. Scott Fitzgerald | 1925");
        books.add("Ender's Game | Orson Scott Card | 1985");

        //return null;
        return books;
    }

}

package com.twu.biblioteca;

public class Book {
    String title;
    String author;
    String pubYear;
    boolean checkedOut;

    public Book(String title, String author, String pubYear, boolean checkedOut){
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
        this.checkedOut = checkedOut;
    }

}

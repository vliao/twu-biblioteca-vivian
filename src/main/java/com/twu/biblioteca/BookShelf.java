package com.twu.biblioteca;

import java.util.*;

public class BookShelf {
    //initialize bookslist
    private List<Book> books = new ArrayList<Book>();

    public BookShelf(){
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
    }

    public BookShelf(List<Book> books){
        this.books = books;
    }

    public String listBooks() {
        String list = "";
        for ( Book b : books ){
            list += b.title + " | " + b.author + " | " + b.pubYear + " | " + b.checkedOut + " \n" ;
        }
        //return null;
        return list;
    }

    public String checkout(String title){
        Iterator<Book> it = books.iterator();
        String response = "Sorry, that book is unavailable";
        while(it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title) && b.checkedOut ==false) {
                b.checkedOut = true;
                response = "Thank you! Enjoy the book!";
                return response;
            }
        }

        return response;
    }

}

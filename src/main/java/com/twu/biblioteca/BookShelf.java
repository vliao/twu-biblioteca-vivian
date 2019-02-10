package com.twu.biblioteca;

import java.util.*;

public class BookShelf {
    //initialize bookslist
    private List<Book> books;


    public BookShelf(List<Book> books){
        this.books = books;
    }

    public String listBooks() {
        System.out.println("We have the following books");
        String list = "";
        for ( Book b : books ){
            list += b.title + " | " + b.author + " | " + b.pubYear + " | " + b.checkedOut + " \n" ;
        }
        //return null;
        return list;
    }

    public String checkout(User u, String title){
        Iterator<Book> it = books.iterator();
        String response = "Sorry, that book is unavailable";
        while(it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title) && b.checkedOut ==false) {
                u.addBook(b);
                b.checkedOut = true;
                response = "Thank you! Enjoy the book!";
                return response;
            }
        }
        return response;
    }

    public String returnBook(User u, String title){
        Iterator<Book> it = books.iterator();
        String response = "That is not a valid book to return";
        while(it.hasNext()) {
            Book b = it.next();
            if (b.title.equals(title) && b.checkedOut ==true) {
                u.removeBook(b);
                System.out.println(u.showBooks());
                b.checkedOut = false;
                response = "Thank you for returning the book";
                return response;
            }
        }
        return response;
    }

}

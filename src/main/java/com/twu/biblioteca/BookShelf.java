package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BookShelf {
    //initialize bookslist
    private List<Book> books = new ArrayList<Book>();

    public BookShelf(){
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925"));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985"));
    }

    public BookShelf(List<Book> books){
        this.books = books;
    }

    public String listBooks() {
        String list = "";
        for ( Book b : books ){
            list += b.title + " | " + b.author + " | " + b.pubYear + " \n " ;
        }
        //return null;
        return list;
    }

    public void checkout(Book book){
        books.remove(book);
        this.listBooks();
    }

}

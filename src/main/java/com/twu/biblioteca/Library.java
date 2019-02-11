package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static BookShelf bookshelf;
    private static MovieShelf movieShelf;
    private static List<User> users = new ArrayList<User>();

    Library(){
        initializeBookShelf();
        initializeMovieShelf();
        initializeUsers();
    }



    public void initializeBookShelf(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        bookshelf = new BookShelf(books);
    }
    public static BookShelf getBookshelf(){
        return bookshelf;
    }

    public void initializeMovieShelf(){
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Up", 2009 , "Pete Doctor", 10 , false));
        movies.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
        movieShelf = new MovieShelf(movies);
    }

    public static MovieShelf getMovieShelf(){
        return movieShelf;
    }

    public void initializeUsers(){
        users.add(new User("John Smith","jsmith@yahoo.com", "123-1234", "123"));

    }

    public static List<User> getUsers() {
        return users;
    }

}

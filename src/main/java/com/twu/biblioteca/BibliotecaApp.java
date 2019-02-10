package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    private BookShelf shelf;
    private MovieShelf movieShelf;
    private User activeUser;
    private List<User> users = new ArrayList<User>();

    public static void main (String[] args){
        BibliotecaApp app = new BibliotecaApp();

        app.users.add(new User("123-1234","321"));

        Welcome start = new Welcome();
        print(start.welcome());
        app.activeUser = start.loginUser(app.users);
        //Login
        print(Menu.showMenuMessage());
        Menu.run();
    }

    public BookShelf getBookshelf(){
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("The Great Gatsby", "F. Scott Fitzgerald", "1925", false));
        books.add(new Book("Ender's Game","Orson Scott Card", "1985", false));
        shelf = new BookShelf(books);

        return shelf;
    }

    public MovieShelf getMovieShelf(){
        List<Movie> movies = new ArrayList<Movie>();
        movies.add(new Movie("Up", 2009 , "Pete Doctor", 10 , false));
        movies.add(new Movie("Moana", 2016, "Ron Clements", 10, false));
        movieShelf = new MovieShelf(movies);
        return movieShelf;
    }

    public String listUsers(){
        String userList = "";
        for (User u: users) {
            userList += u.name;
        }
        return userList;
    }

    public void addUser(User u){
        users.add(u);
    }

    public static void print(String message){
        System.out.println(message);
    }

//    public void loginUser(User u){
//        activeUser = u;
//
//        System.out.println(activeUser.name);
//    }

    public User getActiveUser(){
        return activeUser;
    }

    public void setActiveUser(User u){
        activeUser = u;
    }

    public void setUsers(List<User> users){
        this.users = users;
    }

}
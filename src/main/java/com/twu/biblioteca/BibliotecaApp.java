package com.twu.biblioteca;

public class BibliotecaApp {

    private BookShelf shelf = new BookShelf();
    private MovieShelf movieShelf = new MovieShelf();

    public static void main (String[] args){
        print(Welcome.welcome());
        print(Menu.showMenuMessage());

        Menu.run();
    }

    public BookShelf getBookshelf(){
        return shelf;
    }

    public MovieShelf getMovieShelf(){
        return movieShelf;
    }

    public static void print(String message){
        System.out.println(message);
    }

}
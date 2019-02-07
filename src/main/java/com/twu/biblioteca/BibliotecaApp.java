package com.twu.biblioteca;

public class BibliotecaApp {

    BookShelf shelf = new BookShelf();


    public static void main (String[] args){
        BibliotecaApp app = new BibliotecaApp();


        print(Welcome.welcome());


        print(app.shelf.listBooks());
        print(Menu.showMenuMessage());

        Menu.run(app.shelf);

    }


    public static void print(String message){
        System.out.println(message);
    }

}
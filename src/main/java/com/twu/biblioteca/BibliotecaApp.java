package com.twu.biblioteca;

public class BibliotecaApp {


    private static Library library = new Library();

    public static void main (String[] args){
        BibliotecaApp app = new BibliotecaApp();



        Librarian l = new Librarian();
        l.start();
      //  app.activeUser = start.loginUser(app.users);
        //Login
//
//        Menu menu = new Menu();
//        print(menu.showMenuMessage());
//        menu.run(app);
    }


    public Library getLibrary(){
        return library;
    }

    public static void print(String message){
        System.out.println(message);
    }




}
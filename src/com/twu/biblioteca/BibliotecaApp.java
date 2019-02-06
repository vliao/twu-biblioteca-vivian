package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public String welcome() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return  message;
    }

    public List<String> listBooks(List<String> books) {
        //return null;
        return books;
    }

    public void showAuthorPublication() {
    }

    public static void main (String[] args){
        BibliotecaApp app = new BibliotecaApp();
        System.out.println(app.welcome());
    }
}

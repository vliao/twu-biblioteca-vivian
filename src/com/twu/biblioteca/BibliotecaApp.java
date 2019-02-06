package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

    public String showMenuMessage(){
        String menuMessage = "Here are your options: \n" +
                "1. List all books";

      return menuMessage;
    }

    public static void main (String[] args){
        BibliotecaApp app = new BibliotecaApp();

        //initialize bookslist
        List<String> books = new ArrayList<String>();
        books.add("The Great Gatsby");
        books.add("Ender's Game");

        System.out.println(app.welcome());
        print(app.showMenuMessage());

        //respond to user choice
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch(i){
            case 1:
                print(app.listBooks(books));
                break;
            default:
                print("Invalid option chosen");
        }
    }

    public static void print(String message){
        System.out.println(message);
    }
    public static void print(List<String> message){
        System.out.println(message);
    }
}

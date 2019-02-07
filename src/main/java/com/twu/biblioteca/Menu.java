package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static String showMenuMessage(){
        String menuMessage = "Here are your options: \n" +
                "1. List all books \n" +
                "2. do something else \n " +
                "3. quit" ;

        return menuMessage;
    }

    public static void run(){
        //respond to user choice
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        do {
           processOption(i);
           print(showMenuMessage());
           i = sc.nextInt();
        }
        while (i != 3);
    }

    public static void processOption(int i){

        BookShelf b  = new BookShelf();
        switch(i){
            case 1:
                print(b.listBooks());
                break;
            case 2:
                print("did something");
                break;
            case 3:
                System.exit(0);
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

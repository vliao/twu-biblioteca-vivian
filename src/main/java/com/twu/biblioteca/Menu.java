package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Menu {


    public static String showMenuMessage(){
        String menuMessage = "Here are your options: \n" +
                "1. List all books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. List all movies \n" +
                "5. Checkout a movie \n" +
                "8. Quit";

        return menuMessage;
    }

    public static void run(){
        BibliotecaApp app = new BibliotecaApp();
        BookShelf b = app.getBookshelf();
        MovieShelf m = app.getMovieShelf();

        //app.users.add(new User());
      // app.listUsers();

        //respond to user choice
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        do {
           processOption(b, m, i);
           print(showMenuMessage());
           i = sc.nextInt();
        }
        while (i != 8);
    }

    public static void processOption(BookShelf b, MovieShelf m, int i){
       // Scanner titleScan;
        switch(i){
            case 1:
                print(b.listBooks());
                break;
            case 2:
                System.out.println("What book would you like to check out?");
                Scanner titleScan = new Scanner(System.in);
                String title = titleScan.nextLine();
                print(b.checkout(title));
                break;
            case 3:
                System.out.println("What book would you like to return?");
                Scanner returnTitleScan = new Scanner(System.in);
                String returnTitle = returnTitleScan.nextLine();
                print(b.returnBook(returnTitle));
                break;
            case 4:
                print(m.listMovies());
                break;
            case 5:
                break;

            case 8:
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

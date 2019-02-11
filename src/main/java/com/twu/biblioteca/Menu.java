package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class Menu {
//
//    User user;
//
//    public String showMenuMessage(){
//        String menuMessage = "Here are your options: \n" +
//                "1. List all books \n" +
//                "2. Checkout a book \n" +
//                "3. Return a book \n" +
//                "4. List all movies \n" +
//                "5. Checkout a movie \n" +
//                "6. View my books \n" +
//                "7. View my information \n" +
//                "8. Quit";
//
//        return menuMessage;
//    }
//
//    public void run(BibliotecaApp app){
//        this.user = app.getActiveUser();
//        BookShelf b = app.getLibrary().getBookshelf();
//        MovieShelf m = app.getLibrary().getMovieShelf();
//
//        //respond to user choice
//        Scanner sc = new Scanner(System.in);
//        int i = sc.nextInt();
//
//        do {
//           processOption(b, m, i);
//           print(showMenuMessage());
//           i = sc.nextInt();
//        }
//        while (i != 8);
//    }
//
//    public void processOption(BookShelf b, MovieShelf m, int i){
//        Scanner titleScan = new Scanner(System.in);
//        switch(i){
//            case 1:
//                print(b.listBooks());
//                break;
//            case 2:
//                System.out.println("What book would you like to check out?");
//                String title = titleScan.nextLine();
//                print(b.checkout(user, title));
//                break;
//            case 3:
//                System.out.println("What book would you like to return?");
//                String returnTitle = titleScan.nextLine();
//                print(b.returnBook(user, returnTitle));
//                break;
//            case 4:
//                print(m.listMovies());
//                break;
//            case 5:
//                System.out.println("What movie would you like to checkout?");
//                String movieTitle = titleScan.nextLine();
//                print(m.checkoutMovie(movieTitle));
//                break;
//            case 6:
//                print(user.showBooks());
//                break;
//            case 7:
//                print(user.showInfo());
//                break;
//            case 8:
//                System.exit(0);
//                break;
//            default:
//                print("Invalid option chosen");
//        }
//    }



    public void print(String message){
        System.out.println(message);
    }
    public void print(List<String> message){
        System.out.println(message);
    }
}

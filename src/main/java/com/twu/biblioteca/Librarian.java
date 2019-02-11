package com.twu.biblioteca;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Librarian {
    User activeUser;
    static boolean loggedIn = false;

    public Librarian(){

    }
    public void start(){
        print(welcome());
        loginUser();
        print(showMenuMessage());

        run();
    }
    public String welcome() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return  message;
    }

    public String showMenuMessage(){
        String menuMessage = "Here are your options: \n" +
                "1. List all books \n" +
                "2. Checkout a book \n" +
                "3. Return a book \n" +
                "4. List all movies \n" +
                "5. Checkout a movie \n" +
                "6. View my books \n" +
                "7. View my information \n" +
                "8. Quit";

        return menuMessage;
    }

    public void run(){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        do {
            processOption(i);
            print(showMenuMessage());
            i = sc.nextInt();
        }
        while (i != 8);
    }


    public void processOption(int i){
        Scanner titleScan = new Scanner(System.in);
        switch(i){
            case 1:
                print(Library.getBookshelf().listBooks());
                break;
            case 2:
                System.out.println("What book would you like to check out?");
                String title = titleScan.nextLine();
                print(Library.getBookshelf().checkout(activeUser, title));
                break;
            case 3:
                System.out.println("What book would you like to return?");
                String returnTitle = titleScan.nextLine();
                print(Library.getBookshelf().returnBook(activeUser, returnTitle));
                break;
            case 4:
                print(Library.getMovieShelf().listMovies());
                break;
            case 5:
                System.out.println("What movie would you like to checkout?");
                String movieTitle = titleScan.nextLine();
                print(Library.getMovieShelf().checkoutMovie(movieTitle));
                break;
            case 6:
                print(activeUser.showBooks());
                break;
            case 7:
                print(activeUser.showInfo());
                break;
            case 8:
                System.exit(0);
                break;
            default:
                print("Invalid option chosen");
        }
    }


    public User loginUser(){
        System.out.println("Please log in to view the menu");
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your phone number?");
        String number = userInput.nextLine();
        do {
            System.out.println("What is the password?");
            String password = userInput.nextLine();
            loggedIn = validateUser(number, password, Library.getUsers());
        }
        while(loggedIn==false);
        return activeUser;
    }

    public boolean validateUser(String number, String password, List<User> users){
        Iterator<User> it = users.iterator();
        String correctPassword ="";
        while(it.hasNext()){
            User user = it.next();
            if(number.equals(user.getNumber())){
                correctPassword = user.getPassword();
                activeUser = user;
                break;
            }
        }
        if (password.equals(correctPassword)) {
            System.out.println("password is correct");
            loggedIn = true;
        }
        else {
            System.out.println("password is incorrect, please try again");
        }

        return loggedIn;
    }


    public User getActiveUser(){
        return activeUser;
    }

    public void setActiveUser(User u){
        activeUser = u;
    }
    public void print(String message){
        System.out.println(message);
    }


}

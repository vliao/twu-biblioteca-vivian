package com.twu.biblioteca;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Welcome {
    User loggedInUser;
    static boolean loggedIn = false;

    public  String welcome() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return  message;
    }


    public User loginUser(List<User> users){
        System.out.println("Please log in to view the menu");
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your phone number?");
        String number = userInput.nextLine();
        do {
            System.out.println("What is the password?");
            String password = userInput.nextLine();
            loggedIn = validateUser(number, password, users);
        }
        while(loggedIn==false);
        return loggedInUser;
    }

    public boolean validateUser(String number, String password, List<User> users){
        Iterator<User> it = users.iterator();
        String correctPassword ="";
        while(it.hasNext()){
            User user = it.next();
            if(number.equals(user.getNumber())){
                correctPassword = user.getPassword();
                loggedInUser = user;
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
}

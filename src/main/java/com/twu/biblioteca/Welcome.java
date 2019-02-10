package com.twu.biblioteca;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Welcome {

    static boolean loggedIn = false;

    public  String welcome() {
        String message = "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!";
        return  message;
    }


    public User loginUser(List<User> users){
        User u;
        System.out.println("Please log in to view the menu");
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is the username?");
        String username = userInput.nextLine();
        do {
            System.out.println("What is the password?");
            String password = userInput.nextLine();
            u = new User(username, password);
            loggedIn = validateUser(u, users);
        }
        while(loggedIn==false);
        return u;
    }

    public boolean validateUser(User u, List<User> users){
        //TODO need to check for password that belongs to the user. store in
        Iterator<User> it = users.iterator();
        String password ="";
        while(it.hasNext()){
            User user = it.next();
            if(u.name.equals(user.name)){
                password = user.getPassword();
                break;
            }
        }
        if (u.getPassword().equals(password)) {
            System.out.println("password is correct");
            loggedIn = true;
        }
        else {
            System.out.println("password is incorrect, please try again");
        }

        return loggedIn;
    }
}

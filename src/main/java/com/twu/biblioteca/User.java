package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String password;
    private String email;
    private String number;
    private List<Book> books = new ArrayList<Book>();

    User(String name, String email, String number, String password){
        this.name = name;
        this.email = email;
        this.number = number;
        this.password = password;
    }
    public String getName(){
        return name;
    }
    public String getPassword(){
        return password;
    }

    public void addBook(Book b){
        books.add(b);
    }
    public void removeBook(Book b){
        books.remove(b);
    }

    public String showBooks() {
        String bookTitles= "";
        for (Book b : books){
            bookTitles+= b.title + "\n";
        }
        return bookTitles;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public String showInfo() {
        String info = name + " | " + email + " | " + number;
        return info;
    }
}

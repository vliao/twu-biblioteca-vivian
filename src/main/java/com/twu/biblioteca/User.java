package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class User {
    String name;
    private String password;
    private List<Book> books = new ArrayList<Book>();

    User(String name, String password){
        this.name = name;
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
}

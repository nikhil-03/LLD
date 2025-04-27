package org.example;

public class User {
    String name;
    int balance;

    public User(int balance, String name) {
        this.balance = balance;
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package org.example;

public class User {
    int id;
    String name;
    int amount;

    public User(int amount, int id, String name) {
        this.amount = amount;
        this.id = id;
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

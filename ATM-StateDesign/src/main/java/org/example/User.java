package org.example;

public class User {
    int id;
    String name;
    int accountNo;
    public User(int id, String name, int accountNo) {
        this.id = id;
        this.name = name;
        this.accountNo=accountNo;

    }
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

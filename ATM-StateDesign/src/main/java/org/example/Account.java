package org.example;

public class Account {
    int accountNo;
    AccountType accountType;
    int balance;
    int ATMPin;

    public Account(int accountNo, AccountType accountType, int balance,int ATMPin) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.balance = balance;
        this.ATMPin=ATMPin;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public int getATMPin() {
        return ATMPin;
    }

    public void setATMPin(int ATMPin) {
        this.ATMPin = ATMPin;
    }
}

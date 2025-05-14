package org.example;

import org.example.State.IdleState;

import java.util.ArrayList;
import java.util.List;

public class ATMMachine {
    ATMMachineState atmMachineState;
    List<Account> accounts;
    int ATMTotalBalance;
    int noOf500;
    int noOf100;
    int noOf1000;
    User currentUser;

    public ATMMachine(List<Account> accounts,int five,int one,int thousand) {
        atmMachineState=new IdleState();
        this.accounts=accounts;
        this.noOf500=five;
        this.noOf100=one;
        this.noOf1000=thousand;
        this.ATMTotalBalance=500*five+100*one+1000*thousand;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public int getNoOf100() {
        return noOf100;
    }

    public void setNoOf100(int noOf100) {
        this.noOf100 = noOf100;
    }

    public int getNoOf500() {
        return noOf500;
    }

    public void setNoOf500(int noOf500) {
        this.noOf500 = noOf500;
    }

    public int getATMTotalBalance() {
        System.out.println("Total amount in ATM : "+ATMTotalBalance);
        return ATMTotalBalance;
    }

    public void setATMTotalBalance(int ATMTotalBalance) {
        this.ATMTotalBalance = ATMTotalBalance;
    }

    public int getNoOf1000() {
        return noOf1000;
    }

    public void setNoOf1000(int noOf1000) {
        this.noOf1000 = noOf1000;
    }

    public List<Account> getAccounts() {
        if(accounts==null)return new ArrayList<>();
        for(Account account : accounts)System.out.println("Account No : "+account.accountNo+"  Balance : "+account.balance);
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public ATMMachineState getAtmMachineState() {
        return atmMachineState;
    }

    public void setAtmMachineState(ATMMachineState atmMachineState) {
        this.atmMachineState = atmMachineState;
    }

    public Account getCurrentAccount(){
        if(accounts==null)return null;
        for(Account account: accounts){
            if(account.accountNo==currentUser.getAccountNo())return account;
        }
        return null;
    }
}

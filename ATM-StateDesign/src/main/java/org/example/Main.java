package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Account> accountList=new ArrayList<>();
        for(int i=100;i<=110;i++){
            Account account=new Account(i,AccountType.SAVING,(int)(Math.random() * 1000) * 100,2334);
            accountList.add(account);
        }
        ATMMachine atmMachine=new ATMMachine(accountList,27,33,12);
        atmMachine.getATMTotalBalance();


        User user1=new User(1,"Nikhil", 101);
        User user2=new User(2,"Ram", 109);

        atmMachine.getAtmMachineState().insertCard(atmMachine,user1);
        atmMachine.getAtmMachineState().insertPINCode(atmMachine,1223);
        atmMachine.getAtmMachineState().insertPINCode(atmMachine,2334);
        atmMachine.getAtmMachineState().checkBalance(atmMachine);

        atmMachine.getAtmMachineState().validateDebitAmount(atmMachine,4700);
        atmMachine.getAtmMachineState().enterAmountToWithdraw(atmMachine,4700);

        atmMachine.getATMTotalBalance();


    }

}
package org.example.State;

import org.example.*;

import java.util.List;

public class IdleState implements ATMMachineState {
    @Override
    public void insertCard(ATMMachine atmMachine, User user) throws Exception {
         List<Account> accounts= atmMachine.getAccounts();
         if(accounts==null) {
             System.out.println("No account found");
             throw new Exception("No account found");
         }
         for(Account account: accounts){
             if(account.getAccountNo()==user.getAccountNo()){
                 System.out.println("Account Found, Now enter password");
                 atmMachine.setAtmMachineState(new hasCardState());
             }
         }
         atmMachine.setCurrentUser(user);
    }

    @Override
    public boolean insertPINCode(ATMMachine atmMachine, int pinCode) throws Exception {

        throw new Exception("No card found");
    }
    @Override
    public void selectAccountType(ATMMachine atmMachine, AccountType accountType) throws Exception {
        throw new Exception("Method not allowed in this state");
    }

    @Override
    public int checkBalance(ATMMachine atmMachine) throws Exception {
        throw new Exception("Method not allowed in this state");

    }

    @Override
    public boolean validateDebitAmount(ATMMachine atmMachine, int amount) throws Exception {
        return false;
    }

    @Override
    public void enterAmountToWithdraw(ATMMachine atmMachine, int amount) throws Exception {
        throw new Exception("Method not allowed in this state");
    }

    @Override
    public void cancelTransaction(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmMachineState(new IdleState());
        throw new Exception("Method not allowed in this state, already in Idle state");
    }
}

package org.example.State;

import org.example.ATMMachine;
import org.example.ATMMachineState;
import org.example.AccountType;
import org.example.User;

public class selectionState implements ATMMachineState {
    @Override
    public void insertCard(ATMMachine atmMachine, User user) throws Exception {
        throw new Exception("Method not allowed in this state, currently in selection state");
    }

    @Override
    public boolean insertPINCode(ATMMachine atmMachine, int pinCode) throws Exception {
        throw new Exception("Method not allowed in this state, currently in selection state");
    }

    @Override
    public void selectAccountType(ATMMachine atmMachine, AccountType accountType) throws Exception {
        throw new Exception("Method not allowed in this state, currently in selection state");
    }

    @Override
    public int checkBalance(ATMMachine atmMachine) throws Exception {
        System.out.println("Balance : "+atmMachine.getCurrentAccount().getBalance());
        return atmMachine.getCurrentAccount().getBalance();
    }

    @Override
    public boolean validateDebitAmount(ATMMachine atmMachine, int amount) throws Exception {
        int userBalance = atmMachine.getCurrentAccount().getBalance();
        int totalATMCash = atmMachine.getATMTotalBalance();
        if(userBalance<amount){
            System.out.println("Balance is your account is insufficient");
            return false;
        }
        if(atmMachine.getATMTotalBalance()<amount){
            System.out.println("ATM is out of Money");
            return false;
        }
        System.out.println("Now withdrawing money");
        atmMachine.setAtmMachineState(new cashWithdrawState(atmMachine));
        return true;
    }

    @Override
    public void enterAmountToWithdraw(ATMMachine atmMachine, int amount) throws Exception {
        throw new Exception("Method not allowed in this state, currently in selection state");
    }

    @Override
    public void cancelTransaction(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmMachineState(new IdleState());
    }
}

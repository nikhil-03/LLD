package org.example;

public interface ATMMachineState {
    public void insertCard(ATMMachine atmMachine,User user) throws Exception;
    public boolean insertPINCode(ATMMachine atmMachine,int pinCode) throws Exception;
    public void selectAccountType(ATMMachine atmMachine,AccountType accountType) throws Exception;
    public int checkBalance(ATMMachine atmMachine) throws Exception;
    public boolean validateDebitAmount(ATMMachine atmMachine,int amount) throws Exception;
    public void enterAmountToWithdraw(ATMMachine atmMachine,int amount) throws Exception;
    public void cancelTransaction(ATMMachine atmMachine) throws Exception;

}

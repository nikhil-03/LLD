package org.example.State;

import org.example.*;

public class cashWithdrawState implements ATMMachineState {
    CashWithdrawProcessor cashWithdrawProcessor;
//    public cashWithdrawState() {
//
//    }

    public cashWithdrawState(ATMMachine atmMachine) {
        // Build the chain from lowest to highest
        this.cashWithdrawProcessor =
                new ThousandCashWithdrawProcessor(
                        new FiveHundredCashWithdrawProcessor(
                                new OneHundredCashWithdrawProcessor(null, atmMachine),
                                atmMachine),
                        atmMachine);
    }
    @Override
    public void insertCard(ATMMachine atmMachine, User user) throws Exception {
        throw new Exception("Method not allowed in this state, currently in Withdraw state");
    }

    @Override
    public boolean insertPINCode(ATMMachine atmMachine, int pinCode) throws Exception {
        throw new Exception("Method not allowed in this state, currently in Withdraw state");

    }

    @Override
    public void selectAccountType(ATMMachine atmMachine, AccountType accountType) throws Exception {
        throw new Exception("Method not allowed in this state, currently in Withdraw state");
    }

    @Override
    public int checkBalance(ATMMachine atmMachine) throws Exception {
        return 0;
    }

    @Override
    public boolean validateDebitAmount(ATMMachine atmMachine, int amount) throws Exception {
        throw new Exception("Method not allowed in this state, currently in Withdraw state");

    }

    @Override
    public void enterAmountToWithdraw(ATMMachine atmMachine, int amount) throws Exception {
        int userBalance = atmMachine.getCurrentAccount().getBalance();
        int totalATMCash = atmMachine.getATMTotalBalance();
        if(userBalance<amount){
            System.out.println("Balance is your account is insufficient");
        }
        if(atmMachine.getATMTotalBalance()<amount){
            System.out.println("ATM is out of Money");
        }

        atmMachine.getCurrentAccount().setBalance(userBalance-amount);
        atmMachine.setATMTotalBalance(totalATMCash-amount);
        cashWithdrawProcessor.withdraw(atmMachine, amount);

        System.out.println("Please collect Money");
        System.out.println("You have :"+ atmMachine.getCurrentAccount().getBalance()+ "amount left");
        System.out.println("No Of 100 : "+atmMachine.getNoOf100());
        System.out.println("No Of 500 : "+atmMachine.getNoOf500());
        System.out.println("No Of 1000 :"+atmMachine.getNoOf1000());
    }

    @Override
    public void cancelTransaction(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmMachineState(new IdleState());
    }
}

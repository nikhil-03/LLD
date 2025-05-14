package org.example.State;

import org.example.ATMMachine;
import org.example.ATMMachineState;
import org.example.AccountType;
import org.example.User;

public class hasCardState  implements ATMMachineState {
    @Override
    public void insertCard(ATMMachine atmMachine, User user) throws Exception {
        throw new Exception("Method not allowed in this state, has card state");
    }

    @Override
    public boolean insertPINCode(ATMMachine atmMachine, int pinCode) throws Exception {
       if(atmMachine.getCurrentAccount().getATMPin()!=pinCode){
           System.out.println("Wrong Pin Code, Try again !");
           return false;
       }
       else {
           System.out.println("Now in selection state");
           atmMachine.setAtmMachineState(new selectionState());
           return true;
       }

    }

    @Override
    public void selectAccountType(ATMMachine atmMachine, AccountType accountType) throws Exception {
        throw new Exception("Method not allowed in this state, has card state");
    }

    @Override
    public int checkBalance(ATMMachine atmMachine) throws Exception {
        throw new Exception("Method not allowed in this state, has card state");
    }

    @Override
    public boolean validateDebitAmount(ATMMachine atmMachine, int amount) throws Exception {
        return false;
    }

    @Override
    public void enterAmountToWithdraw(ATMMachine atmMachine, int amount) throws Exception {
        throw new Exception("Method not allowed in this state, has card state");
    }

    @Override
    public void cancelTransaction(ATMMachine atmMachine) throws Exception {
        atmMachine.setAtmMachineState(new IdleState());
    }
}

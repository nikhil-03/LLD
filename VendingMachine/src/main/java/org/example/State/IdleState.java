package org.example.State;

import org.example.Money;
import org.example.VendingMachine;
import org.example.VendingMachineState;

import java.sql.Array;
import java.util.ArrayList;

public class IdleState implements VendingMachineState {
    public IdleState() {
        System.out.println("Currently in Idle State");
    }
    public IdleState(VendingMachine vendingMachine) {
        vendingMachine.setMoney(new ArrayList<>());
        System.out.println("Currently in Idle State");

    }
    @Override
    public void clickOnInsertCoinsButtonState(VendingMachine vendingMachine) throws Exception {
       vendingMachine.setVendingMachineState(new HasMoneyState());
    }

    @Override
    public void insertCoins(Money money, VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }

    @Override
    public void chooseProduct(int value, VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine,int code) throws Exception {
        throw new Exception();
    }

    @Override
    public int getRemainingChange(int amount) throws Exception {
        return 0;
    }


    @Override
    public int getFullRefund(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }


}

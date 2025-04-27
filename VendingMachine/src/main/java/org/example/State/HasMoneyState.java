package org.example.State;

import org.example.Money;
import org.example.VendingMachine;
import org.example.VendingMachineState;

import java.util.ArrayList;
import java.util.List;

public class HasMoneyState implements VendingMachineState {
    @Override
    public void clickOnInsertCoinsButtonState(VendingMachine vendingMachine) throws Exception {
       throw new Exception();
    }

    @Override
    public void insertCoins(Money money, VendingMachine vendingMachine) throws Exception {
        vendingMachine.getMoney().add(money);
    }


    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new ProductSelectionState());
    }

    @Override
    public void chooseProduct(int value, VendingMachine vendingMachine) throws Exception {

    }


    @Override
    public void dispenseProduct(VendingMachine vendingMachine,int code) {

    }

    @Override
    public int getRemainingChange(int amount) throws Exception {
        return 0;
    }


    @Override
    public int getFullRefund(VendingMachine vendingMachine) {
        System.out.println("Refunding Amount");
        vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        List<Money> m = new ArrayList<>();
        vendingMachine.setMoney(m);
        return 0;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine) throws Exception {
      throw new Exception();
    }
}

package org.example.State;

import org.example.Money;
import org.example.Product;
import org.example.VendingMachine;
import org.example.VendingMachineState;

public class ProductSelectionState implements VendingMachineState {
    @Override
    public void clickOnInsertCoinsButtonState(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void insertCoins(Money money, VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {

    }

    @Override
    public void chooseProduct(int value, VendingMachine vendingMachine) throws Exception {
        Product product = vendingMachine.getInventory().findProduct(value);
        int totalInsertedAmount = 0;
        for(Money money : vendingMachine.getMoney()){
            totalInsertedAmount+=money.value;
        }
        if(product.getPrice()>=totalInsertedAmount){
            vendingMachine.setVendingMachineState(new ProductDispenseState(vendingMachine,value));
            if(product.getPrice()>totalInsertedAmount){
                getRemainingChange((int) (totalInsertedAmount-product.getPrice()));
            }
        }
        else{
            System.out.println("Insufficient Amount");
            vendingMachine.setVendingMachineState(new IdleState(vendingMachine));
        }

    }


    @Override
    public void dispenseProduct(VendingMachine vendingMachine,int code) throws Exception
    {
       throw new Exception();
    }

    @Override
    public int getRemainingChange(int amount) throws Exception {
        throw new Exception();

    }


    @Override
    public int getFullRefund(VendingMachine vendingMachine) throws Exception{
        throw new Exception();
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }
}

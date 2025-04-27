package org.example.State;

import org.example.Money;
import org.example.ProductSelf;
import org.example.VendingMachine;
import org.example.VendingMachineState;

public class ProductDispenseState implements VendingMachineState {

    ProductDispenseState(VendingMachine vendingMachine, int ProductCode){
        dispenseProduct(vendingMachine, ProductCode);
    }
    @Override
    public void clickOnInsertCoinsButtonState(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }

    @Override
    public void insertCoins(Money money, VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }


    @Override
    public void clickSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new Exception();
    }

    @Override
    public void chooseProduct(int value, VendingMachine vendingMachine) throws Exception {

    }



    @Override
    public void dispenseProduct(VendingMachine vendingMachine,int code) {
       for(ProductSelf productSelf : vendingMachine.getInventory().getProductSelfList()){
           if(productSelf.isAvailable()){
               if(productSelf.getProductSelfId()==code){
                   productSelf.setAvailable(false);
                   vendingMachine.setVendingMachineState(new IdleState());
               }
           }
       }
    }

    @Override
    public int getRemainingChange(int amount) throws Exception {
        return 0;
    }


    @Override
    public int getFullRefund(VendingMachine vendingMachine) {
        return 0;
    }

    @Override
    public void updateInventory(VendingMachine vendingMachine) {

    }
}

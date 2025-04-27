package org.example;

public interface VendingMachineState {
    void clickOnInsertCoinsButtonState(VendingMachine vendingMachine) throws Exception;
    void insertCoins(Money money, VendingMachine vendingMachine) throws Exception;
    void clickSelectProductButton(VendingMachine vendingMachine) throws Exception;
    void chooseProduct(int value,VendingMachine vendingMachine) throws Exception;
    void dispenseProduct(VendingMachine vendingMachine,int productCode) throws Exception;
    int getRemainingChange(int amount) throws Exception;
    int getFullRefund(VendingMachine vendingMachine) throws Exception;
    void updateInventory(VendingMachine vendingMachine) throws Exception;
}

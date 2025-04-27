package org.example;

import org.example.State.IdleState;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    VendingMachineState vendingMachineState;
    Inventory inventory;
    List<Money> money;

    public VendingMachine() {
        vendingMachineState=new IdleState();
        inventory=new Inventory(10);
        money=new ArrayList<>();
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public List<Money> getMoney() {
        return money;
    }

    public void setMoney(List<Money> money) {
        this.money = money;
    }

    public VendingMachineState getVendingMachineState() {
        return vendingMachineState;
    }

    public void setVendingMachineState(VendingMachineState vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }
}

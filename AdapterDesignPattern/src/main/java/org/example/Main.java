package org.example;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter=new WeightMachineAdapterImpl(new BabyWeightMachine());
        double weightKG = weightMachineAdapter.getWeightInKg();
        System.out.println(weightKG);
    }
}
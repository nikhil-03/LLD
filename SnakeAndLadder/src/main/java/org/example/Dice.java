package org.example;

public class Dice {
    int noOfDice;
    int min,max;
    public Dice(int noOfDice) {
        this.noOfDice = noOfDice;
        this.min=noOfDice;
        this.max=6*noOfDice;
    }
    public int roll(){
        return (int) (Math.random() * (max - min + 1)) +min;
    }
}

package org.example;

public class Ladder implements SpecialMove{
    int locationTo;

    public Ladder(int locationTo) {
        this.locationTo = locationTo;
    }

    @Override
    public int shift(int location) {
        System.out.println("Ladder taken");
        return locationTo;
    }
}

package org.example;

public class Snake implements SpecialMove{
    int locationTo;

    public Snake(int locationTo) {
        this.locationTo = locationTo;
    }

    @Override
    public int shift(int location) {
        System.out.println("Snake bitten");
        return locationTo;
    }
}

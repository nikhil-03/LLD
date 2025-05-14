package org.example;

public class XUV700 implements Vehicle{
    @Override
    public int tankCapacity() {
        return 50;
    }

    @Override
    public int seatingCapacity() {
        return 7;
    }
}

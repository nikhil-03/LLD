package org.example;

public class NULLVehicle implements Vehicle{
    @Override
    public int tankCapacity() {
        System.out.println("No vehicle found");
        return 0;
    }

    @Override
    public int seatingCapacity() {
        return 0;
    }
}

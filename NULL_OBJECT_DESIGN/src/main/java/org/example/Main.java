package org.example;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicle=new VehicleFactory();
        Vehicle swift=vehicle.getVehicleObjects("Swift");
        System.out.println("Seating cap : "+swift.seatingCapacity());
        System.out.println("Fuel cap : "+swift.tankCapacity());

        Vehicle fortuner=vehicle.getVehicleObjects("fortuner");
        fortuner.tankCapacity();
    }
}
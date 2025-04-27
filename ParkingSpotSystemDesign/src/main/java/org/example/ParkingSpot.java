package org.example;

public class ParkingSpot {
    int parkingId;
    VehicleType vehicleType;
    int price;

    public ParkingSpot(int parkingId, VehicleType vehicleType,int price,boolean isAvailable) {
        this.parkingId = parkingId;
        this.vehicleType = vehicleType;
        this.price=price;
        this.isAvailable=isAvailable;
    }

    Vehicle vehicle;
    boolean isAvailable;


    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

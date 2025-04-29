package org.example;

public class Vehicle {
    String vehicleId;
    String brand;
    String carName;
    int dailyRentalCost;
    int hourlyRentalCost;
    boolean isAvailable;

    public Vehicle(String brand, String carName, int dailyRentalCost, int hourlyRentalCost,  String vehicleId) {
        this.brand = brand;
        this.carName = carName;
        this.dailyRentalCost = dailyRentalCost;
        this.hourlyRentalCost = hourlyRentalCost;
        this.isAvailable = true;
        this.vehicleId = vehicleId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

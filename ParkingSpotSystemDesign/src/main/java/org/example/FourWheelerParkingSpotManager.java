package org.example;

public class FourWheelerParkingSpotManager extends ParkingSpotManager{
    public FourWheelerParkingSpotManager(int count,int price) {
        super(count,VehicleType.FOUR_WHEELER,price);
    }
}

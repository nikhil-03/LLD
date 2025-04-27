package org.example;

import java.util.List;

public class TwoWheelerParkingSpotManager extends ParkingSpotManager{
    List<ParkingSpot> parkingSpots;

    public TwoWheelerParkingSpotManager(int count,int price) {
        super(count,VehicleType.TWO_WHEELER,price);
    }
}

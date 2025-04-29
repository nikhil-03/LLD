package org.example;

import java.util.List;

public class CarRentalStore {
    List<User> userList;
    List<VehicleSpot> vehicleSpotList;

    public CarRentalStore(List<User> userList, List<VehicleSpot> vehicleSpotList) {
        this.userList = userList;
        this.vehicleSpotList = vehicleSpotList;
    }
}

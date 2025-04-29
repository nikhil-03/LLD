package org.example;

import java.time.LocalDateTime;
import java.util.List;

public class VehicleSpot {
    VehicleInventory vehicleInventory;
    Location location;
    List<Reservation> reservationList;

    public VehicleSpot(Location location, VehicleInventory vehicleInventory) {
        this.location = location;
        this.vehicleInventory = vehicleInventory;
    }

    public Reservation reserveVehicle(Vehicle vehicle, User user){
        Reservation reservation=new Reservation(LocalDateTime.now(),null,user,vehicle);
        for(Vehicle v: vehicleInventory.getAllVehicles()){
            if(v==vehicle){
                v.isAvailable=false;
            }
        }
        return reservation;
    }
}

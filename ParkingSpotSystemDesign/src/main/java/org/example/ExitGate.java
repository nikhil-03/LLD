package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class ExitGate {
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    LocalDateTime exitTime;


    public ExitGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {
        this.exitTime = LocalDateTime.now();
        this.parkingSpotManagerFactory = parkingSpotManagerFactory;

    }
    public void removeVehicle(Vehicle vehicle,Ticket ticket){
//        parkingSpotManagerFactory.removeVehicle(vehicle);
        LocalDateTime exitTime = LocalDateTime.now();
        Duration duration = Duration.between(ticket.getEntryTime(), exitTime);
        long minutes = duration.toMinutes();

        System.out.println("Vehicle " + vehicle.VehicleId + " was parked for " + minutes + " minutes.");

        parkingSpotManagerFactory.removeVehicle(vehicle);


    }
}

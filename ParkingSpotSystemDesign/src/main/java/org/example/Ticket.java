package org.example;

import java.time.LocalDateTime;

public class Ticket {
    Vehicle vehicle;
    LocalDateTime entryTime;

    public Ticket(LocalDateTime entryTime, Vehicle vehicle) {
        System.out.println("Ticket generated "+ vehicle.VehicleId+" parked at time "+entryTime.toString());
        this.entryTime = entryTime;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}

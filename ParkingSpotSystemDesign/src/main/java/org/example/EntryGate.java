package org.example;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EntryGate {

    ParkingSpotManagerFactory parkingSpotManagerFactory;
    List<Ticket> ticketList=new ArrayList<>();


    public EntryGate(ParkingSpotManagerFactory parkingSpotManagerFactory) {

        this.parkingSpotManagerFactory = parkingSpotManagerFactory;
    }

    void findParking(Vehicle vehicle){
        ParkingSpot parkingSpot=parkingSpotManagerFactory.getParking(vehicle);
        if(parkingSpot.vehicle==vehicle){
            LocalDateTime entryTime = LocalDateTime.now();
            Ticket ticket = new Ticket(entryTime,vehicle);
            ticketList.add(ticket);
        }
    }
    Ticket findTicketByVehicle(Vehicle vehicle){
        for(Ticket ticket: ticketList){
            if(ticket.vehicle==vehicle){
                return ticket;
            }
        }
        System.out.println("No ticket found");
        return null;
    }
}

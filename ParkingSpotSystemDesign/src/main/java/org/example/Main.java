package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ParkingSpotManager fourWheelerParkingSpotManager=new FourWheelerParkingSpotManager(4,60);
        ParkingSpotManager twoWheelerParkingSpotManager=new TwoWheelerParkingSpotManager(6,30);

        ParkingSpotManagerFactory parkingSpotManagerFactory=new ParkingSpotManagerFactory(fourWheelerParkingSpotManager,twoWheelerParkingSpotManager);

        EntryGate entryGate=new EntryGate(parkingSpotManagerFactory);
        ExitGate exitGate = new ExitGate(parkingSpotManagerFactory);


        Vehicle vehicle1=new Vehicle("Baleno","3228",VehicleType.FOUR_WHEELER);
        Vehicle vehicle2=new Vehicle("Activa","0806",VehicleType.TWO_WHEELER);
        Vehicle vehicle3=new Vehicle("Dezire","4462",VehicleType.FOUR_WHEELER);

        entryGate.findParking(vehicle1);
        try { Thread.sleep(2000); } catch (Exception e) { }
        entryGate.findParking(vehicle2);
        try { Thread.sleep(3000); } catch (Exception e) { }
        entryGate.findParking(vehicle3);

        Ticket ticket=entryGate.findTicketByVehicle(vehicle1);

        try { Thread.sleep(5000); } catch (Exception e) { }
        exitGate.removeVehicle(vehicle1,ticket);
        Vehicle vehicle4=new Vehicle("Amaze","3254",VehicleType.FOUR_WHEELER);
        Vehicle vehicle5=new Vehicle("Swift","6578",VehicleType.FOUR_WHEELER);
        Vehicle vehicle6=new Vehicle("Fortuner","9028",VehicleType.FOUR_WHEELER);
        Vehicle vehicle7=new Vehicle("BMW","4462",VehicleType.FOUR_WHEELER);
        try { Thread.sleep(2000); } catch (Exception e) { }
        entryGate.findParking(vehicle4);
        try { Thread.sleep(2000); } catch (Exception e) { }
        entryGate.findParking(vehicle5);
        try { Thread.sleep(2000); } catch (Exception e) { }
        entryGate.findParking(vehicle6);
        try { Thread.sleep(2000); } catch (Exception e) { }
        entryGate.findParking(vehicle7);

    }
}
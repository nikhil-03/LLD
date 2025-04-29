package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList=new ArrayList<>();
        Vehicle v1 = new Vehicle("Toyota", "Corolla", 50, 10, "V001");
        Vehicle v2 = new Vehicle("Honda", "Civic", 55, 12, "V002");
        Vehicle v3 = new Vehicle("Ford", "Focus", 48, 11, "V003");
        Vehicle v4 = new Vehicle("Tesla", "Model 3", 100, 25, "V004");
        Vehicle v5 = new Vehicle("BMW", "X3", 90, 22, "V005");
        vehicleList.add(v1);
        vehicleList.add(v2);
        vehicleList.add(v3);
        vehicleList.add(v4);
        vehicleList.add(v5);

        VehicleInventory vehicleInventory=new VehicleInventory(vehicleList);

        Location location1 = new Location("Bangalore", 560001, "Karnataka");
        Location location2 = new Location("Mumbai", 400001, "Maharashtra");

        List<VehicleSpot> vehicleSpotList=new ArrayList<>();
        VehicleSpot vehicleSpot=new VehicleSpot(location1,vehicleInventory);
        VehicleSpot vehicleSpot1=new VehicleSpot(location2,vehicleInventory);
        vehicleSpotList.add(vehicleSpot1);
        vehicleSpotList.add(vehicleSpot);

        List<User> userList=new ArrayList<>();
        User user1 = new User(1, "Rahul Sharma", "9876543210", "DL1234567890", "123456789012");
        User user2 = new User(2, "Priya Mehta", "9123456789", "DL9876543210", "234567890123");
        userList.add(user1);
        userList.add(user2);

        CarRentalStore carRentalStore=new CarRentalStore(userList,vehicleSpotList);

        List<Vehicle> vehicles=carRentalStore.vehicleSpotList.get(0).vehicleInventory.getAllVehicles();

        for(Vehicle vehicle: vehicles)System.out.println(vehicle.carName+" "+vehicle.isAvailable);
//        try { Thread.sleep(2000); } catch (Exception e) { }
        Reservation reservation=carRentalStore.vehicleSpotList.get(0).reserveVehicle(vehicles.get(1),user2);
        try { Thread.sleep(2000); } catch (Exception e) { }
        System.out.println(reservation.startTime+"--"+reservation.vehicle.carName+"--"+reservation.user.name);

        for(Vehicle vehicle: vehicles)System.out.println(vehicle.carName+" "+vehicle.isAvailable);
        try { Thread.sleep(70000); } catch (Exception e) { }
        Bill bill=new Bill(reservation);
        long billAmount=bill.generateBill();
        System.out.println(billAmount);

        for(Vehicle vehicle: vehicles)System.out.println(vehicle.carName+" "+vehicle.isAvailable);

    }
}
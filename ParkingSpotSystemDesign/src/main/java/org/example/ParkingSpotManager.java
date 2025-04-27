package org.example;

import java.util.ArrayList;
import java.util.List;

 public abstract class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

     public ParkingSpotManager(int count,VehicleType vehicleType,int price) {
         this.parkingSpots=new ArrayList<>();
         for(int i=0;i<count;i++) {
             parkingSpots.add(new ParkingSpot(i,vehicleType,price,true));
         }
     }
     public boolean isParkingAvailable(VehicleType vehicleType){
         System.out.println("Checking availability for " + vehicleType+" "+parkingSpots.size());
          for(ParkingSpot parkingSpot:parkingSpots){
              if(parkingSpot.isAvailable && parkingSpot.vehicleType==vehicleType){
                  return true;
              }
          }
          return false;
     }
     public ParkingSpot parkVehicle(Vehicle vehicle){
         for(ParkingSpot parkingSpot:parkingSpots){
             if(parkingSpot.isAvailable && parkingSpot.vehicleType==vehicle.vehicleType){
                 parkingSpot.setAvailable(false);
                 parkingSpot.setVehicle(vehicle);
                 showParkingSpot();
                 return parkingSpot;
             }
         }
         return null;
     }
     public void removeVehicle(Vehicle vehicle){
         for(ParkingSpot parkingSpot:parkingSpots){
             if(!parkingSpot.isAvailable && parkingSpot.vehicle==vehicle){
                 parkingSpot.setAvailable(true);
                 parkingSpot.setVehicle(null);
                 System.out.println("Removed successfully");
                 showParkingSpot();
                 return;
             }
             else{
                 System.out.println("Some issue happen while removing vehicle");
             }
         }
     }
     public void showParkingSpot(){
         for (ParkingSpot parkingSpot: parkingSpots){
             System.out.println(parkingSpot.parkingId+" "+parkingSpot.price+" "+parkingSpot.vehicleType+" "+parkingSpot.isAvailable);
         }
     }
}

package org.example;

public class ParkingSpotManagerFactory {

    ParkingSpotManager TwoWheelParkingSpotManager;
    ParkingSpotManager FourWheelParkingSpotManager;

    public ParkingSpotManagerFactory(ParkingSpotManager fourWheelParkingSpotManager, ParkingSpotManager twoWheelParkingSpotManager) {
        FourWheelParkingSpotManager = fourWheelParkingSpotManager;
        TwoWheelParkingSpotManager = twoWheelParkingSpotManager;
    }

    ParkingSpot getParking(Vehicle vehicle){
        if(vehicle.vehicleType==VehicleType.TWO_WHEELER){
            if(TwoWheelParkingSpotManager.isParkingAvailable(VehicleType.TWO_WHEELER)){
                return TwoWheelParkingSpotManager.parkVehicle(vehicle);
            }else{
                System.out.println("No Two Wheel parking Available");
            }
        }
        else if(vehicle.vehicleType==VehicleType.FOUR_WHEELER) {
            if(FourWheelParkingSpotManager.isParkingAvailable(VehicleType.FOUR_WHEELER)){
                return FourWheelParkingSpotManager.parkVehicle(vehicle);
            }else{
                System.out.println("No Four Wheel parking Available");
            }
        }

        return null;
    }
    void removeVehicle(Vehicle vehicle){
        if(vehicle.vehicleType==VehicleType.TWO_WHEELER){

            TwoWheelParkingSpotManager.removeVehicle(vehicle);
        }
        else if(vehicle.vehicleType==VehicleType.FOUR_WHEELER) {
            FourWheelParkingSpotManager.removeVehicle(vehicle);
        }

    }
}

package org.example;

public class Vehicle {
    String VehicleId;
    String name;
    VehicleType vehicleType;

    public Vehicle(String name, String vehicleId, VehicleType vehicleType) {
        this.name = name;
        VehicleId = vehicleId;
        this.vehicleType = vehicleType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVehicleId() {
        return VehicleId;
    }

    public void setVehicleId(String vehicleId) {
        VehicleId = vehicleId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}

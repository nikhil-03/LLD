package org.example;

public class VehicleFactory {
    Vehicle getVehicleObjects(String typeOfVehicle){
        if(typeOfVehicle.equals("Swift")){
            return new Swift();
        } else if (typeOfVehicle.equals("XUV700")) {
            return new XUV700();
        }
        else return new NULLVehicle();
    }
}

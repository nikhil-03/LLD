package org.example;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public ExternalButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitRequest(Direction direction,int currentFloor){

        // add logic to select elevator
       System.out.println(elevatorControllerList.get(1).elevator.getFloor());
       elevatorControllerList.get(1).acceptButtonRequest(direction,currentFloor);
    }

}

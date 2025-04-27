package org.example;

import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public InternalButtonDispatcher(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitRequest(int direction){
         // add logic to select elevator
         elevatorControllerList.get(0).acceptButtonRequest(this.elevatorControllerList.get(0).elevator.getDirection(), direction);
    }
}

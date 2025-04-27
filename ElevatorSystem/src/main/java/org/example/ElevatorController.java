package org.example;

public class ElevatorController {
    Elevator elevator;

    public ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }

    public void acceptButtonRequest(Direction direction,int floor){
        // SCAN or LOOK algo implement here
        elevator.move(direction,floor);
    }
}

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ElevatorController> elevatorControllers = new ArrayList<>();

        // Create dispatchers first
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher(elevatorControllers);
        InternalButtonDispatcher internalButtonDispatcher = new InternalButtonDispatcher(elevatorControllers);

        // Now create elevators and controllers
        Elevator elevator1 = new Elevator(Direction.UP, 0, 1, internalButtonDispatcher);
        Elevator elevator2 = new Elevator(Direction.UP, 0, 2, internalButtonDispatcher);

        ElevatorController controller1 = new ElevatorController(elevator1);
        ElevatorController controller2 = new ElevatorController(elevator2);

        elevatorControllers.add(controller1);
        elevatorControllers.add(controller2);

        // Create floors with external button dispatcher
        List<Floors> floorsList = new ArrayList<>();
        floorsList.add(new Floors(1, externalButtonDispatcher));
        floorsList.add(new Floors(2, externalButtonDispatcher));
        floorsList.add(new Floors(3, externalButtonDispatcher));
        floorsList.add(new Floors(4, externalButtonDispatcher));
        floorsList.add(new Floors(5, externalButtonDispatcher));
        floorsList.add(new Floors(6, externalButtonDispatcher));
        floorsList.add(new Floors(7, externalButtonDispatcher));

        Building building = new Building(floorsList);

        // Simulate usage
        floorsList.get(2).externalButton.pressButton(Direction.UP, 5);
        elevator1.internalButton.pressButton(3);
    }
}

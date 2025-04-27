package org.example;

public class ExternalButton {
    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButton(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void pressButton(Direction direction,int currentFloor){
       externalButtonDispatcher.submitRequest(direction,currentFloor);
    }

}

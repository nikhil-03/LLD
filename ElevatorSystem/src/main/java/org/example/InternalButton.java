package org.example;

public class InternalButton {
    InternalButtonDispatcher internalButtonDispatcher;

    public InternalButton(InternalButtonDispatcher internalButtonDispatcher) {
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(int floor){
         internalButtonDispatcher.submitRequest(floor);
    }
}

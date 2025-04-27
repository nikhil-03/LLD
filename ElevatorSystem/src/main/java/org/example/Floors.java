package org.example;

public class Floors {
    int floorId;
    ExternalButton externalButton;

    public Floors( int floorId, ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButton = new ExternalButton(externalButtonDispatcher);
        this.floorId = floorId;
    }
}

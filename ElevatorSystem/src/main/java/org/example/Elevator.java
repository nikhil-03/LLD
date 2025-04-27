package org.example;

public class Elevator {
    int id;
    int floor;
    InternalButton internalButton;
    Direction direction;

    public Elevator(Direction direction, int floor, int id,InternalButtonDispatcher internalButtonDispatcher) {
        this.direction = direction;
        this.floor = floor;
        this.id = id;
        this.internalButton = new InternalButton(internalButtonDispatcher);
    }

    public void move(Direction direction, int floor){
        System.out.println("Elevator " + id + " moving from floor " + this.floor + " to floor " + floor + " in direction " + direction);
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }
}

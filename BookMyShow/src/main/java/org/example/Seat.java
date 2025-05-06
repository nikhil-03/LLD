package org.example;

public class Seat {
    int row;
    int column;
    boolean isAvailable;

    public Seat(int column, int row) {
        this.column = column;
        this.row = row;
        this.isAvailable=true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

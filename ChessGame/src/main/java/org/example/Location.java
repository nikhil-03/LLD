package org.example;

public class Location {
    int x, y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isValid(int boardSize) {
        return x >= 0 && y >= 0 && x < boardSize && y < boardSize;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


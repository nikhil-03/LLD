package org.example;

public class Cell {
    Piece piece;
    boolean isEmpty;
    Location location;

    public Cell( Location location, Piece piece) {
        this.isEmpty = true;
        this.location = location;
        this.piece = piece;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}

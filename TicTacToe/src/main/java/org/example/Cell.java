package org.example;

public class Cell {
    Piece piece;
    boolean isEmpty;

    public Cell(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

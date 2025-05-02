package org.example;

public class Cell {
    Piece piece;
    SpecialMove specialMove;
    boolean isEmpty;

    public Cell(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public SpecialMove getSpecialMove() {
        return specialMove;
    }

    public void setSpecialMove(SpecialMove specialMove) {
        this.specialMove = specialMove;
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

    public void putPiece(Piece piece, int location){

    }
}

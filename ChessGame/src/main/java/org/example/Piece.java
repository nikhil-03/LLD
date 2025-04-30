package org.example;

public abstract class Piece {
    PieceColour pieceColour;
    boolean isAlive;
    public Piece(PieceColour pieceColour) {
        this.pieceColour = pieceColour;
        this.isAlive=true;
    }

    public PieceColour getPieceColour() {
        return pieceColour;
    }

    public void setPieceColour(PieceColour pieceColour) {
        this.pieceColour = pieceColour;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
    public abstract boolean isValidMove(Location from, Location to, Board board);
}

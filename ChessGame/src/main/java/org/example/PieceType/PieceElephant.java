package org.example.PieceType;

import org.example.Board;
import org.example.Location;
import org.example.Piece;
import org.example.PieceColour;

public class PieceElephant extends Piece {
    public PieceElephant(PieceColour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean isValidMove(Location from, Location to, Board board) {
        return (from.getX() == to.getX() || from.getY() == to.getY());
    }
}

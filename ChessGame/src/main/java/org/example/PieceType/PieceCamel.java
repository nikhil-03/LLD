package org.example.PieceType;

import org.example.Board;
import org.example.Location;
import org.example.Piece;
import org.example.PieceColour;

public class PieceCamel extends Piece {
    public PieceCamel(PieceColour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean isValidMove(Location from, Location to, Board board) {
        return Math.abs(from.getX() - to.getX()) == Math.abs(from.getY() - to.getY());
    }
}

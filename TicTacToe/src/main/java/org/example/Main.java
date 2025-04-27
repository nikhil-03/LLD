package org.example;

public class Main {
    public static void main(String[] args) {
        int boardSize=3;

        Board board=new Board(boardSize);


        Piece pieceX=new PieceX(PieceType.X);
        Piece pieceO=new PieceO(PieceType.O);

        board.addPiece(1,1,pieceX);
        board.addPiece(0,1,pieceO);
        board.addPiece(2,2,pieceX);
        board.addPiece(0,2,pieceO);
        board.addPiece(0,0,pieceX);
        board.addPiece(0,0,pieceX);
        board.addPiece(0,5,pieceX);

    }
}
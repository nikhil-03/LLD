package org.example;

import org.example.PieceType.PieceCamel;
import org.example.PieceType.PieceElephant;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        Board board=new Board(8);

        Player white = new Player(1, "Nikhil", PieceColour.WHITE);
        Player black = new Player(2, "Akash", PieceColour.BLACK);
        Queue<Player> players = new LinkedList<>();
        players.add(white);
        players.add(black);

        Game game=new Game(board,players);

        Piece whiteCamel = new PieceCamel(PieceColour.WHITE);
        Piece whiteElephant = new PieceElephant(PieceColour.WHITE);
        Piece blackCamel = new PieceCamel(PieceColour.BLACK);
        Piece blackElephant = new PieceElephant(PieceColour.BLACK);

        board.placePiece(new Location(0, 2), whiteCamel);
        board.placePiece(new Location(0, 0), whiteElephant);
        board.placePiece(new Location(7, 2), blackCamel);
        board.placePiece(new Location(7, 0), blackElephant);

        game.move(new Location(0,0),new Location(2,2));


    }
}
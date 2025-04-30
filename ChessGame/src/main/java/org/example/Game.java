package org.example;

import javax.crypto.spec.PSource;
import java.util.Queue;

public class Game {
    Board board;
    Queue<Player> player;

    public Game(Board board, Queue<Player> playerQueue) {
        this.board = board;
        this.player = playerQueue;
    }

    public void move(Location from, Location to){
       Player currentPlayer = player.peek();
       Cell source = board.getCell(from);
       Cell destination = board.getCell(to);


       Piece piece = source.getPiece();

        if (piece.getPieceColour() != currentPlayer.getPieceColour()) {
          System.out.println("You can't move opponent's piece");
          return;
        }

        if (!piece.isValidMove(from, to, board)) {
        System.out.println("Invalid move for this piece");
        return;
        }

        if (!destination.isEmpty()) {
        Piece destPiece = destination.getPiece();
        if (destPiece.getPieceColour() == piece.getPieceColour()) {
            System.out.println("Destination has your own piece");
            return;
        }
        // Capture
        destPiece.setAlive(false);
        System.out.println("Captured opponent piece");
    }

        destination.setPiece(piece);
        source.setPiece(null);

        player.poll(); // switch turn
        player.add(currentPlayer);
}

}

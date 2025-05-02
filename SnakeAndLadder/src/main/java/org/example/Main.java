package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Board board=new Board(10);
        board.addSnake(23,5);
        board.addSnake(95,56);

        board.addLadder(8,34);
        board.addLadder(34,91);


        Player player1=new Player(1,"Nikhil");
        Player player2=new Player(2,"Anshi");

        Queue<Player> players=new LinkedList<>();
        players.add(player1);
        players.add(player2);

        Game game=new Game(board,players);
        game.startGame();

    }
}
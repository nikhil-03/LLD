package org.example;

import java.util.Queue;

public class Game {
    Board board;
    Queue<Player> playerQueue;
    boolean winnerDeclared=false;
    Dice dice=new Dice(1);
    public Game(Board board, Queue<Player> playerQueue) {
        this.board = board;
        this.playerQueue = playerQueue;
    }

    public void startGame(){
        while(!winnerDeclared){
            Player currentPlayer = playerQueue.poll();
            board.cell[currentPlayer.getPlayerLocation()].setEmpty(true);
            int diceValue = dice.roll();
            System.out.println("Dice Value "+diceValue);
            System.out.println("Player Name "+currentPlayer.name+" location "+currentPlayer.playerLocation);
            int newLocation = currentPlayer.getPlayerLocation()+diceValue;
            int afterSpecialMove=newLocation;
            if(newLocation>= board.size* board.size){
                playerQueue.add(currentPlayer);
                continue;
            }
            if(board.cell[newLocation].getSpecialMove()!=null){
               System.out.println("Special move found at location "+newLocation);
               afterSpecialMove = board.cell[newLocation].getSpecialMove().shift(newLocation);
            }
            if(afterSpecialMove> board.size* board.size){
                playerQueue.add(currentPlayer);
                continue;
            }
            currentPlayer.setPlayerLocation(afterSpecialMove);
            board.cell[afterSpecialMove].setEmpty(false);
            if(afterSpecialMove== (board.size* board.size)-1){
                System.out.println("Winner is "+ currentPlayer.name);
                winnerDeclared=true;
            }
            playerQueue.add(currentPlayer);
        }


    }
}

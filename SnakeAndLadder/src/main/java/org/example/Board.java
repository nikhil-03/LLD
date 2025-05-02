package org.example;

import java.util.Queue;

public class Board {
    int size;
    Cell[] cell;
    Queue<Player> playerQueue;
    public Board(int size) {
        this.size = size;
        this.cell = new Cell[size * size];
        for(int i=0;i<size*size;i++){
            cell[i]=new Cell(true);
        }
    }

    public void addSnake(int cellIndex,int toLocation){
        if(cellIndex<=toLocation){
            System.out.println("This snake not possible");
            return;
        }
        cell[cellIndex].setSpecialMove(new Snake(toLocation));
    }
    public void addLadder(int cellIndex,int toLocation){
        if(cellIndex>=toLocation){
            System.out.println("This ladder not possible");
            return;
        }
        cell[cellIndex].setSpecialMove(new Ladder(toLocation));
    }

}

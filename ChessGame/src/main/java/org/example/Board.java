package org.example;

import java.util.Queue;

public class Board {
    Cell[][] cell;
    int boardSize;
    Queue<Player> playerQueue;

    public Board(int boardSize) {
        this.boardSize = boardSize;
        cell=new Cell[boardSize][boardSize];
        for(int i=0;i<boardSize;i++){
            for(int j=0;j<boardSize;j++){
                cell[i][j]=new Cell(new Location(i,j),null);
            }
        }
    }

    public boolean isValidLocation(Location loc) {
        return loc.isValid(boardSize);
    }

    public Cell getCell(Location location) {
        return cell[location.x][location.y];
    }

    public void placePiece(Location location, Piece piece) {
        if (!isValidLocation(location)) {
            throw new IllegalArgumentException("Invalid board position");
        }
        Cell cell = getCell(location);
        if (!cell.isEmpty()) {
            throw new IllegalStateException("Cell already occupied");
        }
        cell.setPiece(piece);
    }

    public int getSize() {
        return boardSize;
    }


}

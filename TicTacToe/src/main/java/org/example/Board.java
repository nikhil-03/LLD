package org.example;

public class Board {
    int size;
    Cell [][]cells;
    public Board(int size) {
        this.size = size;
        this.cells=new Cell[size][size];
        initialiseBoard();
        printBoard();
    }

    private void initialiseBoard(){
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++){
                cells[i][j]=new Cell(true);
            }
        }
    }

    private void printBoard(){
        for(int i=0;i<size;i++) {
            for(int j=0;j<size;j++){
                if(cells[i][j].isEmpty){
                    System.out.print(" - ");
                }
                else{
                    System.out.print(" "+cells[i][j].getPiece().toString()+" ");
                }
            }
            System.out.println();
        }
        System.out.println("End");
    }

    public void addPiece(int x, int y,Piece piece){
        if(x<0 || y<0 || x>=size || y>=size) {
            System.out.println("Add proper index row and column");
            return;
        }
        if(!cells[x][y].isEmpty) {
            System.out.println("This box has been used by user");
            return;
        }
        cells[x][y].setPiece(piece);
        cells[x][y].setEmpty(false);
        printBoard();
        //checkIfWin(); implement
    }


}

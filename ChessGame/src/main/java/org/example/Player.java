package org.example;

public class Player {
    int id;
    PieceColour pieceColour;
    String name;

    public Player(int id, String name, PieceColour pieceColour) {
        this.id = id;
        this.name = name;
        this.pieceColour = pieceColour;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PieceColour getPieceColour() {
        return pieceColour;
    }

    public void setPieceColour(PieceColour pieceColour) {
        this.pieceColour = pieceColour;
    }
}

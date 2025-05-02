package org.example;

public class Player {
    int id;
    String name;
    int playerLocation;

    public Player(int id, String name) {
        this.id = id;
        this.name = name;
        this.playerLocation = 0;
    }

    public int getPlayerLocation() {
        return playerLocation;
    }

    public void setPlayerLocation(int playerLocation) {
        this.playerLocation = playerLocation;
    }
}

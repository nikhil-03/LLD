package org.example;

public class Memento {
    int length;
    int breadth;

    public Memento(int breadth, int length) {
        this.breadth = breadth;
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}

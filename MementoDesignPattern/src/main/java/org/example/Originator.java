package org.example;

public class Originator {
    // addMemento
    int length,width;

    public Originator(int length, int width) {
        this.length = length;
        this.width = width;
    }



    public void setLength(int length) {
        this.length = length;
    }


    public void setWidth(int width) {
        this.width = width;
    }

    public Memento createMemento(){
        return new Memento(this.length,this.width);
    }

    // Undo Memento
    public void restoreMemento(Memento memento){
        this.length=memento.length;
        this.width=memento.breadth;
    }
}

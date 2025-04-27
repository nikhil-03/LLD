package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Memento design pattern - originator , history/caretaker,memento");
        CareTakerHistory careTakerHistory = new CareTakerHistory();

        Originator originator = new Originator(5, 8);

        Memento memento=originator.createMemento(); // one data created

        careTakerHistory.addMemento(memento);

        originator.setWidth(11);
        originator.setLength(16);

        Memento memento1=originator.createMemento();
        careTakerHistory.addMemento(memento1);

        System.out.println("Length : "+originator.length+" Height : "+originator.width);

        Memento memento2=careTakerHistory.undoMemento();
        originator.restoreMemento(memento2);

        System.out.println("Length : "+originator.length+" Height : "+originator.width);

//        Memento memento3=careTakerHistory.undoMemento();
//        originator.restoreMemento(memento3);
//        System.out.println("Length : "+originator.length+" Height : "+originator.width);

    }
}
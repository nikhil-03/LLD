package org.example;

import java.util.ArrayList;
import java.util.List;

public class CareTakerHistory {
    List<Memento> mementoList=new ArrayList<>();
    public void addMemento(Memento memento) {
        mementoList.add(memento);
        System.out.println("Inserted, now size is - "+mementoList.size());
    }

    public Memento undoMemento(){
        int size = mementoList.size();
        if(size<=1) {
            System.out.println("No History - "+mementoList.size());
            return null;
        }
        Memento memento = mementoList.get(size - 2);
        mementoList.remove(size-2);
        System.out.println("Popped, now size is - "+mementoList.size());
        return memento;
    }
}

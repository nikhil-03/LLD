package org.example.DuckImpl;

public class NaturalQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I quack normally and naturally");
    }
}

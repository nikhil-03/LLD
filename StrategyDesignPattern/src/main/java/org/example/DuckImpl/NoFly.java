package org.example.DuckImpl;

public class NoFly implements FlyBehavior{
    @Override
    public void flyType() {
        System.out.println("I don't fly, Hehe");
    }
}

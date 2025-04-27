package org.example.DuckImpl;

public class RobotQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("I quack like a robot");
    }
}

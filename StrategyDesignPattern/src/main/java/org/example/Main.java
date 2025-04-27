package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Duck duck=new MallardDuck();
        duck.fly();
        duck.quack();

        Duck robotDuck = new RobotDuck();
        robotDuck.fly();
        robotDuck.quack();
    }
}
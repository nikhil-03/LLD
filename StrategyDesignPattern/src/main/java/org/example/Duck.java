package org.example;

import org.example.DuckImpl.FlyBehavior;
import org.example.DuckImpl.QuackBehavior;

public class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void fly(){
        flyBehavior.flyType();
    }
    public void quack(){
        quackBehavior.quack();
    }
}

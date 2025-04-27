package org.example;

import org.example.DuckImpl.FlyBehavior;
import org.example.DuckImpl.NoFly;
import org.example.DuckImpl.QuackBehavior;
import org.example.DuckImpl.RobotQuack;

public class RobotDuck extends Duck{
    public RobotDuck() {
        super(new NoFly(), new RobotQuack());
    }
}

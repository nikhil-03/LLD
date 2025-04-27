package org.example;

import org.example.DuckImpl.FlyBehavior;
import org.example.DuckImpl.FlyWithWings;
import org.example.DuckImpl.NaturalQuack;
import org.example.DuckImpl.QuackBehavior;

public class MallardDuck extends Duck{
   public MallardDuck(){
       super(new FlyWithWings(),new NaturalQuack());
   }

}

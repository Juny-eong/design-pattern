package org.example.strategy.simulator;


import org.example.strategy.*;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck(new FlyWings(), new Quack());

        duck.performFly();

        duck.performQuack();

        duck.setFlyBehavior(new NoFly());

        duck.performFly();
    }
}

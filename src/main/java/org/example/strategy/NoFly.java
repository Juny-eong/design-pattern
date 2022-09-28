package org.example.strategy;

public class NoFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}

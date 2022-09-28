package org.example.strategy;

public class FlyWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("fly with wing~~");
    }
}

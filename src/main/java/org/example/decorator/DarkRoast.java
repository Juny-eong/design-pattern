package org.example.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        this.description = "DarkRoast";
    }

    @Override
    public double getCost() {
        return .65;
    }
}

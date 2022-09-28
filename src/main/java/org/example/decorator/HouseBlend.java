package org.example.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        this.description = "HouseBlend";
    }

    @Override
    public double getCost() {
        return 5.55;
    }
}

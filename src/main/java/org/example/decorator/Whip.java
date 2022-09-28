package org.example.decorator;


public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .11;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}

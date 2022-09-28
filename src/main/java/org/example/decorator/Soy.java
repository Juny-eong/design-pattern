package org.example.decorator;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return beverage.getCost() + .40;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }
}

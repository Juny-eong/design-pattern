package org.example.decorator.simulator;

import org.example.decorator.*;

public class DecoratorSimulator {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": $" + beverage.getCost());

        Beverage beverage2 = new Whip(new Whip(new Mocha(new DarkRoast())));
        System.out.println(beverage2.getDescription() + ": $" + beverage2.getCost());

        Beverage beverage3 = new Soy(new Mocha(new Whip(new HouseBlend())));
        System.out.println(beverage3.getDescription() + ": $" + beverage3.getCost());
    }
}

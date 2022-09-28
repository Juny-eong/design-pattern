package org.example.decorator;


public abstract class Beverage {

    protected String description = "empty";

    public abstract double getCost();

    public String getDescription() {
        return this.description;
    }

}

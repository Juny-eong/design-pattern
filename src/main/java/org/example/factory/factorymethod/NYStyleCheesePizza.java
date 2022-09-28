package org.example.factory.factorymethod;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        this.pizzaType = PizzaType.CHEESE;
        this.name = "ny style cheese pizza";
        this.dough = "thin crust dough";
        this.sauce = "marinara sauce";

        toppings.add("sliced reggiano cheese");
    }
}

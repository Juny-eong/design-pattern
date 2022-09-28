package org.example.factory.factorymethod;

public class NYStyleVeggiePizza extends Pizza {

    public NYStyleVeggiePizza() {
        this.pizzaType = PizzaType.VEGGIE;
        this.name = "ny style veggie pizza";
        this.dough = "thin crust dough";
        this.sauce = "marinara sauce";

        toppings.add("sliced reggiano cheese");
    }
}

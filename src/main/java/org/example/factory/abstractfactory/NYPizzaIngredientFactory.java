package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.ingredient.*;
import org.example.factory.abstractfactory.veggies.Garlic;
import org.example.factory.abstractfactory.veggies.Mushroom;
import org.example.factory.abstractfactory.veggies.Onion;
import org.example.factory.abstractfactory.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{ new Garlic(), new Onion(), new Mushroom() };
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClams();
    }
}

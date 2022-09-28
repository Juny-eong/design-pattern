package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.ingredient.*;
import org.example.factory.abstractfactory.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}

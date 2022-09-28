package org.example.factory.factorymethod;

import java.util.Arrays;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(PizzaType type) {

        if (type.equals(PizzaType.CHEESE)) {
            return new NYStyleCheesePizza();
        } else if (type.equals(PizzaType.VEGGIE)) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }

    }


}

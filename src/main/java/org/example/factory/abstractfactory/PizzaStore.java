package org.example.factory.abstractfactory;

import org.example.factory.factorymethod.PizzaType;

public abstract class PizzaStore {

    public AbstractPizza orderPizza(PizzaType type) {

        AbstractPizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract AbstractPizza createPizza(PizzaType type);

}

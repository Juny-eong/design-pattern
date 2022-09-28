package org.example.factory.abstractfactory;

import org.example.factory.factorymethod.PizzaType;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected AbstractPizza createPizza(PizzaType type) {

        AbstractPizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();

        if (type == PizzaType.CHEESE) {
            pizza = new CheesePizza(factory);
            pizza.setName("new york style cheese pizza");
        }
        else if (type == PizzaType.CLAM) {
            pizza = new ClamPizza(factory);
            pizza.setName("new york style veggie pizza");
        }
        return pizza;
    }
}

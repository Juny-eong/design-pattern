package org.example.factory.factorymethod.simulator;

import org.example.factory.factorymethod.NYPizzaStore;
import org.example.factory.factorymethod.Pizza;
import org.example.factory.factorymethod.PizzaStore;
import org.example.factory.factorymethod.PizzaType;

public class FactoryMethodSimulator {

    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        Pizza pizza = nyStore.orderPizza(PizzaType.CHEESE);

        System.out.println("pizza info:" + pizza.getName());
        System.out.println("-----------------------------");

        Pizza pizza2 = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("pizza info:" + pizza2.getName());
    }
}

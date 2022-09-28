package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.ingredient.*;
import org.example.factory.abstractfactory.veggies.Veggies;
import org.example.factory.factorymethod.PizzaType;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPizza {

    protected PizzaType pizzaType;
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;
    protected List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake() {
        System.out.println("baking..");
    }

    public void cut() {
        System.out.println("cutting..");
    }

    public void box() {
        System.out.println("boxing..");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

package org.example.factory.factorymethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected PizzaType pizzaType;
    protected String name;
    protected String dough;
    protected String sauce;
    protected List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("prepare: " + this.name);
        System.out.println(toppings.stream().reduce((s1, s2) -> s1 + ", " + s2).orElse(""));
    }

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

}

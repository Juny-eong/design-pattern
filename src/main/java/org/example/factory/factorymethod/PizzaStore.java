package org.example.factory.factorymethod;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 실제 객체 생성을 서브클래스에 캡슐화
     * 팩토리 메서드를 추상 메서드로 선언해서 서브클래스가 객체 생성을 책임지도록 한다.
     * abstract Product factoryMethod(String type)
     */
    protected abstract Pizza createPizza(PizzaType type);

}

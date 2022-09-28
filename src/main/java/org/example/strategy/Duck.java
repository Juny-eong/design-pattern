package org.example.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public abstract class Duck {

    private FlyBehavior flyBehavior;

    private QuackBehavior quackBehavior;

    public void performFly() {
       flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}

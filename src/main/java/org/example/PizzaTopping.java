package org.example;

public abstract class PizzaTopping extends ToppingDecorator<Pizza> implements Pizza{
    protected PizzaTopping(Pizza pizza){
        super(pizza);
    }
}

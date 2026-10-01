package org.example;

public abstract class DrinkTopping extends  ToppingDecorator<Drink> implements Drink {
    protected DrinkTopping(Drink drink){
        super(drink);
    }
}

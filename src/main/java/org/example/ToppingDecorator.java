package org.example;

public abstract class ToppingDecorator extends Drinks {

    protected final Drinks drink;

    protected ToppingDecorator(Drinks drink) {
        this.drink = drink;
    }


    @Override
    public String getName() {
        return drink.getName();
    }


    // @Override
    // public Size getSize() {
    //     return drink.getSize();
    // }

    // @Override
    // public void addTopping(ITopping topping) {
    //     drink.addTopping(topping);
    // }

    // @Override
    // public double getPrice() {
    //     return drink.getPrice() + getToppingPrice();
    // }

    // @Override
    // public String getDescription() {
    //     return drink.getDescription() + " " + getToppingName();
    // }

    protected abstract double getToppingPrice();
    protected abstract String getToppingName();
}

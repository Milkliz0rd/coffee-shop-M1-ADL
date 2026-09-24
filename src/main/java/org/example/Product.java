package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Product {

    private final String name;
    private final Size size;
    private final List<ITopping> toppings =  new ArrayList<>();

    protected Product(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }
    public Size getSize() {
        return size;
    }

    public void addTopping(ITopping topping) {
        toppings.add(topping);
    }

    public double getPrice() {
        double price = getBasePrice();
        for (ITopping topping : toppings) {
            price += topping.getExtraPrice();
        }
        return price;
    }

    protected abstract double getBasePrice();

    public String getDescription() {
        String description = getName();
        boolean first = true;
        for (ITopping topping : toppings) {
            description += (first ? " au " : " ") + topping.getName();
            first = false;
        }
        return description;
    }
}

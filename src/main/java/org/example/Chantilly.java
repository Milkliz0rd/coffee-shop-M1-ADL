package org.example;

public class Chantilly extends ToppingDecorator {

    private static final double PRICE_S = 0.5;
    private static final double PRICE_M = 1;
    private static final double PRICE_L = 1.5;

    public Chantilly(Drinks drink) {
        super(drink);
    }

    @Override
    protected double getToppingPrice() {
        return 0;
        // return switch (drink.getSize()) {
        //     case S -> PRICE_S;
        //     case M -> PRICE_M;
        //     case L -> PRICE_L;
        // };
    }

    @Override
    protected String getToppingName() {
        return "Chantilly";
    }
}

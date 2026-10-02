package org.example;

public class Mozzarella extends PizzaTopping {

    private static final int PRICE_S = 150;
    private static final int PRICE_M = 200;
    private static final int PRICE_L = 300;

    public Mozzarella(Pizza pizza){
        super(pizza);
    }

    @Override
    protected int getToppingPrice() {
        return switch (getSize()) {
            case S -> PRICE_S;
            case M -> PRICE_M;
            case L -> PRICE_L;
        };
    }

    @Override
    protected String getToppingName() {
        return "Mozzarella";
    }

    @Override
    protected String getToppingArticle() {
        return "supplément";
    }
}

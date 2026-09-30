package org.example;

public class Chantilly extends ToppingDecorator {

    private static final int PRICE_S = 50;
    private static final int PRICE_M = 100;
    private static final int PRICE_L = 150;

    public Chantilly(Product product) {
        super(product);
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
        return "Chantilly";
    }

    @Override
    protected String getToppingArticle() {
        return "à la";
    }
}

package org.example;

public class Chantilly extends DrinkTopping {

    private static final int PRICE_S = 50;
    private static final int PRICE_M = 100;
    private static final int PRICE_L = 150;

    public Chantilly(Drink drink) {
        super(drink);
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

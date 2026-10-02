package org.example;

public class Champignons extends PizzaTopping {

    private static final int PRICE_CHAMPIGNON = 50;

    public Champignons(Pizza pizza){
        super(pizza);
    }

    @Override
    protected int getToppingPrice() {
        return PRICE_CHAMPIGNON;
    }

    @Override
    protected String getToppingName() {
        return "Champignons";
    }

    @Override
    protected String getToppingArticle() {
        return "supplément";
    }
}

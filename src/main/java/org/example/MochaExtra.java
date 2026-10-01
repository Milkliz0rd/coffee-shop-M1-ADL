package org.example;

public class MochaExtra extends DrinkTopping {

    private static final int PRICE_EXTRA_MOCHA = 100;

    public MochaExtra(Drink drink){
        super(drink);
    }

    @Override
    public int getToppingPrice() {
        return PRICE_EXTRA_MOCHA;
    }

    @Override
    public String getToppingName(){
        return "Mocha";
    }

    @Override
    protected String getToppingArticle() {
        return "au";
    }
}

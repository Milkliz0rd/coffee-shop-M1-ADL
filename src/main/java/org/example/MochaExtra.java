package org.example;

public class MochaExtra extends ToppingDecorator{

    private static final int PRICE_EXTRA_MOCHA = 100;

    public MochaExtra(Product product){
        super(product);
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

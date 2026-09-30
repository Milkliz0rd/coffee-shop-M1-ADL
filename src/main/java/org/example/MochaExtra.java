package org.example;

public class MochaExtra extends ToppingDecorator{

    private static final double PRICE_EXTRA_MOCHA = 1;

    public MochaExtra(Product product){
        super(product);
    }

    @Override
    public double getToppingPrice() {
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

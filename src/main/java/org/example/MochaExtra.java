package org.example;

public class MochaExtra implements ITopping{

    private static final double PRICE_EXTRA_MOCHA = 1;

    @Override
    public double getExtraPrice() {
        return PRICE_EXTRA_MOCHA;
    }

    @Override
    public String getName(){
        return "Mocha";
    }

}

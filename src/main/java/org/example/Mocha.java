package org.example;

public class Mocha extends Drink {

    private final static double MOCHA_S_PRICE = 5;
    private final static double MOCHA_M_PRICE = 6.50;
    private final static double MOCHA_L_PRICE = 7.50;

    public Mocha(Size size){
        super("Mocha", size);
    }

    @Override
    protected double getBasePrice()
    {
        return switch (getSize()){
            case S ->  MOCHA_S_PRICE;
            case M ->  MOCHA_M_PRICE;
            case L ->  MOCHA_L_PRICE;
        };
    }
}

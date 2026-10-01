package org.example;

public class Mocha extends BaseProduct implements Drink {

    private final static int MOCHA_S_PRICE = 500;
    private final static int MOCHA_M_PRICE = 650;
    private final static int MOCHA_L_PRICE = 750;

    public Mocha(Size size){
        super("Mocha", size);
    }

    @Override
    protected int getBasePrice()
    {
        return switch (getSize()){
            case S ->  MOCHA_S_PRICE;
            case M ->  MOCHA_M_PRICE;
            case L ->  MOCHA_L_PRICE;
        };
    }
}

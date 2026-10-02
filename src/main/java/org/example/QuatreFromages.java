package org.example;

public class QuatreFromages extends BaseProduct implements Pizza{

    private final static int QUATRE_FROMAGES_S_PRICE = 1100;
    private final static int QUATRE_FROMAGES_M_PRICE = 1250;
    private final static int QUATRE_FROMAGES_L_PRICE = 1300;


    public QuatreFromages(Size size) {
        super("Quatre fromages", size);
    }

    @Override
    protected int getBasePrice(){
        return switch (getSize()){
            case S -> QUATRE_FROMAGES_S_PRICE;
            case M -> QUATRE_FROMAGES_M_PRICE;
            case L -> QUATRE_FROMAGES_L_PRICE;
        };
    }
}

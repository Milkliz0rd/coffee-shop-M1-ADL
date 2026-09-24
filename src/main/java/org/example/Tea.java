package org.example;

public class Tea extends Drink {

    private final static double TEA_S_PRICE = 2;
    private final static double TEA_M_PRICE = 2.50;
    private final static double TEA_L_PRICE = 3;

    public Tea(Size size){
        super("Thé", size);
    }

    @Override
    protected double getBasePrice() {
        return switch (getSize()){
            case S -> TEA_S_PRICE;
            case M -> TEA_M_PRICE;
            case L -> TEA_L_PRICE;
        };
    }
}

package org.example;

public class Tea extends BaseProduct implements Drink {

    private final static int TEA_S_PRICE = 200;
    private final static int TEA_M_PRICE = 250;
    private final static int TEA_L_PRICE = 300;

    public Tea(Size size){
        super("Thé", size);
    }

    @Override
    protected int getBasePrice() {
        return switch (getSize()){
            case S -> TEA_S_PRICE;
            case M -> TEA_M_PRICE;
            case L -> TEA_L_PRICE;
        };
    }
}

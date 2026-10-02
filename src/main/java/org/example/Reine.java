package org.example;

public class Reine extends BaseProduct implements Pizza{

    private final static int REINE_S_PRICE = 1000;
    private final static int REINE_M_PRICE = 1150;
    private final static int REINE_L_PRICE = 1250;


    public Reine(Size size) {
        super("Reine", size);
    }

    @Override
    protected int getBasePrice(){
        return switch (getSize()){
            case S -> REINE_S_PRICE;
            case M -> REINE_M_PRICE;
            case L -> REINE_L_PRICE;
        };
    }
}

package org.example;

public class HotChocolate extends Drink {

    private final static double HOT_CHOCOLATE_S_PRICE = 3;
    private final static double HOT_CHOCOLATE_M_PRICE = 4;
    private final static double HOT_CHOCOLATE_L_PRICE = 5;

    public HotChocolate(Size size){
        super("Chocolat Chaud", size);
    }

    @Override
    protected double getBasePrice(){
        return switch (getSize()){
            case S ->  HOT_CHOCOLATE_S_PRICE;
            case M ->  HOT_CHOCOLATE_M_PRICE;
            case L ->  HOT_CHOCOLATE_L_PRICE;
        };
    }
}

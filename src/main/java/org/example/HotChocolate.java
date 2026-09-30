package org.example;

public class HotChocolate extends Drink {

    private final static int HOT_CHOCOLATE_S_PRICE = 300;
    private final static int HOT_CHOCOLATE_M_PRICE = 400;
    private final static int HOT_CHOCOLATE_L_PRICE = 500;

    public HotChocolate(Size size){
        super("Chocolat Chaud", size);
    }

    @Override
    protected int getBasePrice(){
        return switch (getSize()){
            case S ->  HOT_CHOCOLATE_S_PRICE;
            case M ->  HOT_CHOCOLATE_M_PRICE;
            case L ->  HOT_CHOCOLATE_L_PRICE;
        };
    }
}

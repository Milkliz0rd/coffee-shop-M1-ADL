package org.example;

public class Caramel implements ITopping {

    private static final double CARAMEL_PRICE = 0.5;

    @Override
    public double getExtraPrice() {
        return CARAMEL_PRICE;
    }

    @Override
    public String getName(){
        return "Caramel";
    }
}

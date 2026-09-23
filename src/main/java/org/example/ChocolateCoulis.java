package org.example;

public class ChocolateCoulis implements ITopping{

    private static final double PRICE_CHOCOLATE_COULIS = 1;

    @Override
    public double getExtraPrice() {
        return  PRICE_CHOCOLATE_COULIS;
    }

    @Override
    public String getName() {
        return "Chocolate Coulis";
    }
}

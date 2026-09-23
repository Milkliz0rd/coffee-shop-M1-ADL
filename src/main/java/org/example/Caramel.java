package org.example;

public class Caramel implements ITopping {

    private static final int CARAMEL_PRICE = 1;

    @Override
    public int getExtraPrice() {
        return CARAMEL_PRICE;
    }
}

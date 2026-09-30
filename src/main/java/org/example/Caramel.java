package org.example;

public class Caramel extends ToppingDecorator {

    private static final double CARAMEL_PRICE = 0.5;

    public Caramel(Product product){
        super(product);
    }

    @Override
    protected double getToppingPrice(){
        return CARAMEL_PRICE;
    }

    @Override
    protected String getToppingName(){
        return "Caramel";
    }
}

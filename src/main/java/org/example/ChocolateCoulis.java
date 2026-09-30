package org.example;

public class ChocolateCoulis extends ToppingDecorator{

    private static final double PRICE_CHOCOLATE_COULIS = 1;

    public ChocolateCoulis(Product product){
        super(product);
    }

    @Override
    public double getToppingPrice() {
        return  PRICE_CHOCOLATE_COULIS;
    }

    @Override
    public String getToppingName() {
        return "Coulis au chocolat";
    }

    @Override
    protected String getToppingArticle(){
        return "au";
    }
}

package org.example;

public class ChocolateCoulis extends ToppingDecorator{

    private static final int PRICE_CHOCOLATE_COULIS = 100;

    public ChocolateCoulis(Product product){
        super(product);
    }

    @Override
    public int getToppingPrice() {
        return  PRICE_CHOCOLATE_COULIS;
    }

    @Override
    public String getToppingName() {
        return "Coulis chocolat";
    }

    @Override
    protected String getToppingArticle(){
        return "au";
    }
}

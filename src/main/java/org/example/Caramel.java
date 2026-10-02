package org.example;

public class Caramel extends DrinkTopping {

    private static final int CARAMEL_PRICE = 50;

    public Caramel(Drink drink){
        super(drink);
    }

    @Override
    protected int getToppingPrice(){
        return CARAMEL_PRICE;
    }

    @Override
    protected String getToppingName(){
        return "Caramel";
    }

    @Override
    protected String getToppingArticle(){
        return "au";
    }
}

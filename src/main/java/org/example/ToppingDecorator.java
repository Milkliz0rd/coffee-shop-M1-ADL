package org.example;

public abstract class ToppingDecorator < T extends Product > implements Product {

    protected final T product;

    protected ToppingDecorator(T product) {
        this.product = product;
    }

    @Override
    public String getName() {
        return product.getName();
    }

     @Override
     public Size getSize() {
        return product.getSize();
     }

     @Override
     public int getPrice() {
         return product.getPrice() + getToppingPrice();
     }

     @Override
     public String getDescription() {
         if(product instanceof ToppingDecorator){
            return product.getDescription() + " " + getToppingName();
         }
         return product.getDescription()+ " " + getToppingArticle() + " " + getToppingName();
     }

    protected abstract int getToppingPrice();
    protected abstract String getToppingName();
    protected abstract String getToppingArticle();

}

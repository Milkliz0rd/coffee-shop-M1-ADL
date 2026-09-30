package org.example;

public abstract class ToppingDecorator extends Product {

    protected final Product product;

    protected ToppingDecorator(Product product) {
        super(product.getName(), product.getSize());
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
     public int getBasePrice() {
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

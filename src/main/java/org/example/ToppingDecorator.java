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
     public void addTopping(ITopping topping) {
         product.addTopping(topping);
     }

     @Override
     public double getBasePrice() {
         return product.getPrice() + getToppingPrice();
     }

     @Override
     public String getDescription() {
         return product.getDescription() + " " + getToppingName();
     }

    protected abstract double getToppingPrice();
    protected abstract String getToppingName();
}

package org.example;

public class Receipt {

    public static void print(Order order){
        for(Product product : order.getProducts()){
            System.out.println(product.getDescription() + " : " + PriceFormatter.format(product.getPrice()));
        }
        System.out.println("Total price: " + PriceFormatter.format(order.getTotalPrice()));
    }
}

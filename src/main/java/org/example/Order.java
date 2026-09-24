package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Product> products = new ArrayList<Prouct>();

    public void addProduct(Product item) {
        products.add(item);
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Product item : products) {
            totalPrice += item.getPrice();
        }
        return totalPrice;
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }
}

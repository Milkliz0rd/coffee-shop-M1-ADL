package org.example;

public class Main {
    static void main(String[] args) {
        CoffeeShopMenu menu = new CoffeeShopMenu();
        Order order = new Order();

        order.addProduct(menu.create("Café", Size.L));
        order.addProduct(menu.create("Chocolat viennois", Size.M));
        order.addProduct(new Caramel(new Chantilly(menu.create("Thé", Size.S))));
        order.addProduct(menu.create("Café caramel chantilly", Size.M));

        Receipt.print(order);
    }
}

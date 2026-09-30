package org.example;

public class Main {
    static void main(String[] args) {
        Order order = new Order();

        Product coffee = new Coffee(Size.L);
        order.addProduct(coffee);

        Product tea = new MochaExtra(new Caramel(new Tea(Size.M)));
        order.addProduct(tea);

        Product hotChocolate = new Chantilly(new HotChocolate(Size.S));
        order.addProduct(hotChocolate);

        Product mocha = new Chantilly(new Mocha(Size.L));
        order.addProduct(mocha);

        for (Product product : order.getProducts()) {
            System.out.println(product.getDescription() + " : " + String.format("%.2f €", product.getPrice()));
        }
        System.out.println("Total price: " + String.format("%.2f €", order.getTotalPrice()));
    }
}

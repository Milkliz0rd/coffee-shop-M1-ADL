package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        Order order = new Order();

        Product coffee = new Coffee(Size.L);
        order.addProduct(coffee);

        Product tea =new Tea(Size.M);
        tea.addTopping(new Caramel());
        tea.addTopping(new MochaExtra());
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

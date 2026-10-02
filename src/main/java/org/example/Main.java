package org.example;

public class Main {
    static void main(String[] args) {
        CoffeeShopMenu menuCoffee = new CoffeeShopMenu();
        Order orderCoffee = new Order();

        orderCoffee.addProduct(menuCoffee.create("Café", Size.L));
        orderCoffee.addProduct(menuCoffee.create("Chocolat viennois", Size.M));
        orderCoffee.addProduct(new Caramel(new Chantilly(menuCoffee.create("Thé", Size.S))));
        orderCoffee.addProduct(menuCoffee.create("Café caramel chantilly", Size.M));

        Receipt.print(orderCoffee);

        PizzeriaMenu menuPizza = new PizzeriaMenu();
        Order orderPizza = new Order();
        orderPizza.addProduct(menuPizza.create("Margherita", Size.L));
        orderPizza.addProduct(menuPizza.create("Quatre fromages", Size.S));
        orderPizza.addProduct(new Mozzarella(menuPizza.create("Margherita", Size.M)));
        orderPizza.addProduct(new Champignons(menuPizza.create("Reine", Size.L)));
        Receipt.print(orderPizza);
    }
}

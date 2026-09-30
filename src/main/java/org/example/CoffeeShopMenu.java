package org.example;

public class CoffeeShopMenu extends Menu {

     public CoffeeShopMenu() {
         register("Café", size -> new Coffee(size));
         register("Thé", size -> {
             Product tea = new MochaExtra(new Caramel(new Tea(size)));
             return tea;
         });
         register("Chocolat chaud", size -> {
             return new Chantilly(new HotChocolate(size));
         });
         register("Mocha", size -> {
             return new Chantilly(new Mocha(size));
         });
     }


}

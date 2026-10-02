package org.example;

public class CoffeeShopMenu extends Menu<Drink> {

     public CoffeeShopMenu() {
         register("Café", size -> new Coffee(size));
         register("Thé",size -> new Tea(size) );
         register("Mocha", size -> new Mocha(size));
         register("Chocolat chaud", size -> new HotChocolate(size));

         register("Thé Mocha", size -> new MochaExtra(new Tea(size)));

         register("Chocolat viennois", size -> new Chantilly(new HotChocolate(size)));

         register("Café caramel chantilly", size -> new Chantilly(new Caramel(new Coffee(size))));
     }


}

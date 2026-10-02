package org.example;

public class Coffee extends BaseProduct implements Drink {

   private final static int COFFEE_S_PRICE = 100;
   private final static int COFFEE_M_PRICE = 150;
   private final static int COFFEE_L_PRICE = 200;

   public Coffee(Size size) {
      super("Café", size);
   }

   @Override
   protected int getBasePrice() {
      return switch (getSize()) {
         case S -> COFFEE_S_PRICE;
         case M -> COFFEE_M_PRICE;
         case L -> COFFEE_L_PRICE;
      };
   }
}
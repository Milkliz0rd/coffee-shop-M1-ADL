package org.example;

public class Coffee extends Drink {

   private final static double COFFEE_S_PRICE = 1;
   private final static double COFFEE_M_PRICE = 1.50;
   private final static double COFFEE_L_PRICE = 2;

   public Coffee(Size size) {
      super("Café", size);
   }

   @Override
   protected double getBasePrice() {
      return switch (getSize()) {
         case S -> COFFEE_S_PRICE;
         case M -> COFFEE_M_PRICE;
         case L -> COFFEE_L_PRICE;
      };
   }
}
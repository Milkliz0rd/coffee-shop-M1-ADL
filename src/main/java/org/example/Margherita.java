package org.example;

public class Margherita extends BaseProduct implements Pizza{

    private final static int MARGHERITA_S_PRICE = 800;
    private final static int MARGHERITA_M_PRICE = 1000;
    private final static int MARGHERITA_L_PRICE = 1100;


    public Margherita(Size size) {
        super("Margherita", size);
    }

   @Override
   protected int getBasePrice(){
        return switch (getSize()){
            case S -> MARGHERITA_S_PRICE;
            case M -> MARGHERITA_M_PRICE;
            case L -> MARGHERITA_L_PRICE;
        };
   }
}

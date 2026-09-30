package org.example;

public class PriceFormatter {

    public static String format(int cents){
        int euro = cents / 100;
        int cent = cents % 100;
        return String.format("%d,%02d €", euro, cent);
    }
}

package org.example;

public class PizzeriaMenu extends Menu<Pizza> {

    public PizzeriaMenu(){
        register("Margherita", size -> new Margherita(size));
        register("Reine", size -> new Reine(size));
        register("Quatre fromages", size -> new QuatreFromages(size));
    }
}

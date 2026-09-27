package org.example;

import java.util.HashMap;
import java.util.Map;

public abstract class Menu {

    private final Map<String, ProductFactory> recipes = new HashMap<>();

    public void register(String name, ProductFactory factory) {
        recipes.put(name, factory);
    }

    public Product create(String name, Size size) {
        if(recipes.containsKey(name)) {
            return recipes.get(name).create(size);
        }
        throw new IllegalArgumentException("Produit non trouvé: " + name);
    }
}

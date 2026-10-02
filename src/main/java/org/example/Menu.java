package org.example;

import java.util.HashMap;
import java.util.Map;

public abstract class Menu <T extends Product> {

    private final Map<String, ProductFactory<T>> recipes = new HashMap<>();

    public void register(String name, ProductFactory<T> factory) {
        recipes.put(name, factory);
    }

    public T create(String name, Size size) {
        if(recipes.containsKey(name)) {
            return recipes.get(name).create(size);
        }
        throw new IllegalArgumentException("Produit non trouvé: " + name);
    }
}

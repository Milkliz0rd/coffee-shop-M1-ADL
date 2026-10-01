package org.example;

public interface ProductFactory<T extends Product> {
    T create(Size size);
}

package org.example;

public abstract class Product {

    private final String name;
    private final Size size;

    protected Product(String name, Size size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public String getDescription(){
        return getName();
    };

    public int getPrice(){
        return getBasePrice();
    }

    protected abstract int getBasePrice();


}

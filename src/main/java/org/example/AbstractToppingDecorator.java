package org.example;

public class AbstractToppingDecorator implements ITopping {
    private ITopping topping;
    public AbstractToppingDecorator(ITopping topping) {
        this.topping = topping;
    }

    protected abstract int

    @Override
    public int getExtraPrice() {

    }
}

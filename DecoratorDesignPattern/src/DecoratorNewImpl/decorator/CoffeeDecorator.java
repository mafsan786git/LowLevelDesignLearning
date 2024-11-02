package DecoratorNewImpl.decorator;

import DecoratorNewImpl.Coffee;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee coffee;

    CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}

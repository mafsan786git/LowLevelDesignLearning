package DecoratorNewImpl.decorator;

import DecoratorNewImpl.Coffee;

public class Whip extends CoffeeDecorator {
    public Whip(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Whip";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 5;
    }
}

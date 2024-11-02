package DecoratorNewImpl.decorator;

import DecoratorNewImpl.Coffee;

public class Mocha extends CoffeeDecorator {
    public Mocha(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Mocha";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 20;
    }

}

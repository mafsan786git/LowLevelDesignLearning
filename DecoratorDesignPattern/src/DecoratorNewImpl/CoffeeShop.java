package DecoratorNewImpl;

import DecoratorNewImpl.decorator.Milk;
import DecoratorNewImpl.decorator.Mocha;
import DecoratorNewImpl.decorator.Whip;

public class CoffeeShop {
    public static void main(String[] args) {
        //Simple Espresso
        Coffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " $" + espresso.getCost());

        //DarkRoast with Milk
        Coffee darkRoastWithMilk = new Milk(new DarkRoast());
        System.out.println(darkRoastWithMilk.getDescription() + " $" + darkRoastWithMilk.getCost());

        //Espresso with Mocha and Whip
        Coffee espressoWithMochaAndWhip = new Whip(new Mocha(new Espresso()));
        System.out.println(espressoWithMochaAndWhip.getDescription() + " $" + espressoWithMochaAndWhip.getCost());

        //DarkRoast with Milk and Mocha and whip
        Coffee darkRoastWithMilkAndMochaAndWhip = new Whip(new Mocha(new Milk(new DarkRoast())));
        System.out.println(darkRoastWithMilkAndMochaAndWhip.getDescription() + " $" + darkRoastWithMilkAndMochaAndWhip.getCost());

    }
}

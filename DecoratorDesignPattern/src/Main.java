import decorator.BasePizza;
import decorator.ExtraCheese;
import decorator.MargheritaPizza;
import decorator.Mushroom;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new MargheritaPizza()));
        System.out.println(basePizza.cost());
    }
}
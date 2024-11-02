package DecoratorNewImpl;

public class DarkRoast implements Coffee {
    @Override
    public String getDescription() {
        return "Dark Roast";
    }

    @Override
    public double getCost() {
        return 50;
    }
}

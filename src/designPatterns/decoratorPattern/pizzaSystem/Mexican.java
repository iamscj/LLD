package designPatterns.decoratorPattern.pizzaSystem;

public class Mexican extends BasePizza{
    @Override
    public int cost() {
        return 100;
    }
}

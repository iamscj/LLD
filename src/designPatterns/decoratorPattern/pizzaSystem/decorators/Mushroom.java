package designPatterns.decoratorPattern.pizzaSystem.decorators;

import designPatterns.decoratorPattern.pizzaSystem.BasePizza;

public class Mushroom extends Topping{
    BasePizza pizza;

    public Mushroom(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int cost() {
        return pizza.cost() + 5;
    }
}

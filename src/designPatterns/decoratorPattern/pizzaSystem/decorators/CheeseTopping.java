package designPatterns.decoratorPattern.pizzaSystem.decorators;

import designPatterns.decoratorPattern.pizzaSystem.BasePizza;

public class CheeseTopping extends Topping {

    BasePizza pizza;

    public CheeseTopping(BasePizza pizza) {
        this.pizza = pizza;
    }

    public int cost() {
        return pizza.cost() + 10;
    }
}

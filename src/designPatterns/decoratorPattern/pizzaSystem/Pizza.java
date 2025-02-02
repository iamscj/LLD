package designPatterns.decoratorPattern.pizzaSystem;

import designPatterns.decoratorPattern.pizzaSystem.decorators.CheeseTopping;
import designPatterns.decoratorPattern.pizzaSystem.decorators.Mushroom;

public class Pizza {
    public static void main(String[] args) {
        
//        I want cheese topping on mexican pizza
        BasePizza pizza = new Mexican();
        BasePizza cheeseToppingAdded = new CheeseTopping(pizza);
        System.out.println(cheeseToppingAdded.cost()); // op: 100 + 10
        
//        I want chess and mushroom topping on Marghareta Pizza
        BasePizza marghareta = new Marghareta();
        BasePizza margharetaWithTopping = new CheeseTopping(new Mushroom(marghareta));
        System.out.println(margharetaWithTopping.cost()); // op: 150 + 10 + 5
    }
}

package designPatterns.strategyPattern.withoutStrategy;

public class OffRoadVehicle extends Vehicle {

    // this method implementation is duplicated in two places (sports and off-road vehicle)
    public void drive() {
        System.out.println("Sports Drive Mode");
    }
}

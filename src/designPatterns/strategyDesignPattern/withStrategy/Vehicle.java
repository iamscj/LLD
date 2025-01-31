package designPatterns.strategyDesignPattern.withStrategy;

import designPatterns.strategyDesignPattern.withStrategy.Strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy driveStrategy;

    // this is known as constructor injection
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        driveStrategy.drive();
    }
}

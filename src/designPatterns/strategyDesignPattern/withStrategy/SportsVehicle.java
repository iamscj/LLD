package designPatterns.strategyDesignPattern.withStrategy;

import designPatterns.strategyDesignPattern.withStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

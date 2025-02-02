package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.Strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsDriveStrategy());
    }
}

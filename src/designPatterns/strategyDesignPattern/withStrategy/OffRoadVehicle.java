package designPatterns.strategyDesignPattern.withStrategy;

import designPatterns.strategyDesignPattern.withStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}

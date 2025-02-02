package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.Strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {
    public OffRoadVehicle() {
        super(new SportsDriveStrategy());
    }
}

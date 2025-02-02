package designPatterns.strategyPattern.withStrategy;

import designPatterns.strategyPattern.withStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}

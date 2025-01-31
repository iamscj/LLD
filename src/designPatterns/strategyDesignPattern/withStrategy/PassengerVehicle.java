package designPatterns.strategyDesignPattern.withStrategy;

import designPatterns.strategyDesignPattern.withStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}

package designPatterns.strategyPattern.withStrategy.Strategy;

public class SportsDriveStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Sports Drive Mode");
    }
}

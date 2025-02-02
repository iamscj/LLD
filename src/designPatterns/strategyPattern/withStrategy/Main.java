package designPatterns.strategyPattern.withStrategy;

public class Main {
    public static void main(String[] args) {
        designPatterns.strategyPattern.withStrategy.Vehicle sportsVehicle = new designPatterns.strategyPattern.withStrategy.SportsVehicle();
        sportsVehicle.drive(); // prints: sports drive mode

        designPatterns.strategyPattern.withStrategy.Vehicle passengerVehicle = new designPatterns.strategyPattern.withStrategy.PassengerVehicle();
        passengerVehicle.drive(); // prints: normal drive mode
    }
}

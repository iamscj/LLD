package designPatterns.strategyDesignPattern.withStrategy;

public class Main {
    public static void main(String[] args) {
        designPatterns.strategyDesignPattern.withStrategy.Vehicle sportsVehicle = new designPatterns.strategyDesignPattern.withStrategy.SportsVehicle();
        sportsVehicle.drive(); // prints: sports drive mode

        designPatterns.strategyDesignPattern.withStrategy.Vehicle passengerVehicle = new designPatterns.strategyDesignPattern.withStrategy.PassengerVehicle();
        passengerVehicle.drive(); // prints: normal drive mode
    }
}

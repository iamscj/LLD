package designPatterns.strategyPattern.withStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive(); // prints: sports drive mode

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive(); // prints: normal drive mode
    }
}

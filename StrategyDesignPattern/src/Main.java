import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.PassengerVehicle;
import WithStrategyPattern.SportsVehicle;

public class Main {
    public static void main(String[] args) {
        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
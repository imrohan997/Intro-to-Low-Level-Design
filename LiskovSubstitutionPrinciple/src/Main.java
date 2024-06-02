import java.util.ArrayList;
import java.util.List;

/**
 * This module demonstrates Liskov Substitution Principle.
 */
public class Main {
    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new BiCycle());
        vehicles.add(new Car());
        vehicles.add(new MotorCycle());

        for(Vehicle vehicle : vehicles) {
            System.out.println( vehicle.getNumberOfWheels());
        }


        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new MotorCycle());

        for(EngineVehicle engineVehicle : engineVehicles) {
            System.out.println(engineVehicle.hasEngine());
        }
    }
}
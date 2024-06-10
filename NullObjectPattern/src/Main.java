
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleObj("BIKE");
        printVehicleDetails(vehicle);
    }

    public static void printVehicleDetails(Vehicle vehicle) {
        System.out.println("Seating capacity : " + vehicle.getSeatingCapacity());
        System.out.println("Tank Capacity : " + vehicle.getTankCapacity());
    }
}
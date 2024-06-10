public class VehicleFactory {
    static Vehicle getVehicleObj(String vehicle) {
        if("CAR".equalsIgnoreCase(vehicle)) {
            return new Car();
        }

        return new NullVehicle();
    }
}

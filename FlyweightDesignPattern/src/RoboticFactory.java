import java.util.HashMap;
import java.util.Map;

public class RoboticFactory {

    static private Map<String, IRobot> roboticObjectCache = new HashMap<>();

    public static IRobot createRobot(String robotType) {
        if(roboticObjectCache.containsKey(robotType)) {
            return roboticObjectCache.get(robotType);
        } else if(robotType.equalsIgnoreCase("HUMANOID")) {
            String sprite = new String();
            HumanoidRobot humanoidRobot = new HumanoidRobot(robotType, sprite);
            roboticObjectCache.put(robotType, humanoidRobot);
            return humanoidRobot;
        } else if(robotType.equalsIgnoreCase("ROBOTDOG")) {
            String sprite = new String();
            RobotDog robotDog = new RobotDog(robotType, sprite);
            roboticObjectCache.put(robotType, robotDog);
            return robotDog;
        }
         return null;
    }
}

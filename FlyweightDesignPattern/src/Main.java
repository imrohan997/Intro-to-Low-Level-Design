//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRobot humanoidRobot1 = RoboticFactory.createRobot("HUMANOID");
        System.out.println(RoboticFactory.createRobot("HUMANOID"));
        humanoidRobot1.display(1,2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot("HUMANOID");
        System.out.println(RoboticFactory.createRobot("HUMANOID"));
        humanoidRobot2.display(4,5);
    }
}
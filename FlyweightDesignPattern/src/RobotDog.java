public class RobotDog implements IRobot {
    String type;
    String body; //small 2d bitmap

    public RobotDog(String type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        //logic to display robotdog robot
    }
}

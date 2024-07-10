public class HumanoidRobot implements IRobot {
    String type;
    String body; //small 2d bitmap

    public HumanoidRobot(String type, String body) {
        this.type = type;
        this.body = body;
    }

    @Override
    public void display(int x, int y) {
        //logic to display humanoid robot
    }
}

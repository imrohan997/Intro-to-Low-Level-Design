package LiskovSubstitutionPrinciple;

public class MotorCycle implements Bike{
    boolean isEngineOn;
    int speed;
    @Override
    public void turnonEngine() {
        isEngineOn = true;
    }

    @Override
    public void accelarate() {
        speed = speed + 10;
    }
}

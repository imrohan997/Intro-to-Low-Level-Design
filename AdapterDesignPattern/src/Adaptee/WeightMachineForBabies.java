package Adaptee;

public class WeightMachineForBabies implements WeightMachine{

    int weight;

    public WeightMachineForBabies() {
    }

    @Override
    public void setWeightInPounds(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeightInPounds() {
        return weight;
    }
}

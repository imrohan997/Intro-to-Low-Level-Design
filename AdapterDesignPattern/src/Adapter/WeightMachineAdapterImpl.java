package Adapter;

import Adaptee.WeightMachine;
import Adaptee.WeightMachineForBabies;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(int weightInPounds) {
        this.weightMachine = new WeightMachineForBabies();
        this.weightMachine.setWeightInPounds(weightInPounds);
    }

    @Override
    public double convertWeightFromPoundToKg() {
       return (double) (0.45 * weightMachine.getWeightInPounds());
    }
}

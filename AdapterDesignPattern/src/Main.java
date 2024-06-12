import Adapter.WeightMachineAdapter;
import Adapter.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(20);
        System.out.println(weightMachineAdapter.convertWeightFromPoundToKg());
    }
}
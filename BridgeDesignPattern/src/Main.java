import abstraction.Dog;
import abstraction.Fish;
import abstraction.LivingThings;
import abstraction.Tree;
import implementor.LandBreatheImplementation;
import implementor.TreeBreatheImplementation;
import implementor.WaterBreatheImplementation;

public class Main {
    public static void main(String[] args) {

        LivingThings livingThings1 = new Dog(new LandBreatheImplementation());
        livingThings1.breatheProcess();

        LivingThings livingThings2 = new Fish(new WaterBreatheImplementation());
        livingThings2.breatheProcess();

        LivingThings livingThings3 = new Tree(new TreeBreatheImplementation());
        livingThings3.breatheProcess();
    }
}
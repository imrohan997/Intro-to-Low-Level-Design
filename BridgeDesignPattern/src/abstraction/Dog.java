package abstraction;

import implementor.BreatheImplementor;

public class Dog extends LivingThings{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    public void breatheProcess() {
        breatheImplementor.breathe();
    }
}

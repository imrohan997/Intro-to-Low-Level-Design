package InterfaceSegmentedPrinciple;

/**
 * I - Interface Segment Principle states that interfaces should be such that client
 * implementing it should not implement unnecessary methods
 */
public class Chef implements ChefInterface{
    @Override
    public void cookFood() {
        System.out.println("Cook food for customers");
    }

    @Override
    public void decideMenu() {
        System.out.println("decide menu for customers");
    }
}

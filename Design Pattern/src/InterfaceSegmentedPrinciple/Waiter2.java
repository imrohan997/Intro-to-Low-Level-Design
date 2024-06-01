package InterfaceSegmentedPrinciple;

/**
 * I - Interface Segment Principle states that interfaces should be such that client
 * implementing it should not implement unnecessary methods
 */
public class Waiter2 implements WaiterInterface{
    @Override
    public void serveCustomers() {
        System.out.println("Serve food to customers");
    }

    @Override
    public void takeOrders() {
        System.out.println("Take order from customers");
    }
}

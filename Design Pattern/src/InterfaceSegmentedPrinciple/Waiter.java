package InterfaceSegmentedPrinciple;

/**
 * I - Interface Segment Principle states that interfaces should be such that client
 * implementing it should not implement unnecessary methods
 */
public class Waiter implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // not my job
    }

    @Override
    public void serveCustomers() {
        System.out.println("Server cutomers");
    }

    @Override
    public void cookFood() {
        // not my job
    }
}

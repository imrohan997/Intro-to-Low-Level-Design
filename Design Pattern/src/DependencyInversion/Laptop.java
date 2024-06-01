package DependencyInversion;

/**
 * Classes should depend on interfaces rather than concrete classes
 */
public class Laptop {
    Keyboard keyboard;
    Mouse mouse;

    public Laptop(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

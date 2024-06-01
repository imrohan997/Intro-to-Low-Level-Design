package LiskovSubstitutionPrinciple;

/**
 * Liskov Substitition Principle - If class B is subtype of class A then
 * we should be able to replace object of A with object of B without breaking behaviour
 * of the program.
 */
public interface Bike {
    void turnonEngine() throws Exception;
    void accelarate();
}

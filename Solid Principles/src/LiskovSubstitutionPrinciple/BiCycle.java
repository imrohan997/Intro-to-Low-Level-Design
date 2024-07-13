package LiskovSubstitutionPrinciple;

public class BiCycle implements Bike{
    @Override
    public void turnonEngine() throws Exception {
        throw new Exception("BiCycle does not have engine.");
    }

    @Override
    public void accelarate() {
        //do something
    }
}

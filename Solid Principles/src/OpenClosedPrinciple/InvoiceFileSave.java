package OpenClosedPrinciple;

public class InvoiceFileSave implements InvoiceDAO{
    @Override
    public void save() {
        System.out.println("Invoice File save");
    }
}

package OpenClosedPrinciple;

public class InvoiceDbSave implements InvoiceDAO{
    @Override
    public void save() {
        System.out.println("Save Invoice in Db");
    }
}

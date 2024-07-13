package SingleResponsibilityPrinciple;

/**
 * S - Single Responsibility Principle states that one class should handle only Single responsibilty.
 */
public class Invoice {
    Marker marker;
    int quantity;


    public Invoice(Marker marker, int quantity) {
        this.marker = marker;
        this.quantity = quantity;
    }

    //Calculates total sum of invoice
    public int calculateTotal() {
        return marker.price * quantity;
    }


/**
 * Removed below methods so that this class have only Single Responsibility
  */

//    //Save invoice
//    public void saveInvoice() {
//
//    }
//
//    //Prints Invoice
//    public void printInvoice() {
//
//    }
}

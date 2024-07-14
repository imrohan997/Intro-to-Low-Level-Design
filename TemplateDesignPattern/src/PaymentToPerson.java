public class PaymentToPerson extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request logic of PayToPerson");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees charged");
    }

    @Override
    public void debitAmountFromSenderAccount() {
        System.out.println("Debit logic of PayToFriend");
    }

    @Override
    public void creditAmountToReceiverAccount() {
        System.out.println("Credit logic of PayToPerson");
    }
}

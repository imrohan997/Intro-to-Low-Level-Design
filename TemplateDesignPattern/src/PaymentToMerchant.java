public class PaymentToMerchant extends PaymentFlow{
    @Override
    public void validateRequest() {
        System.out.println("Validate request logic of PayToMerchant");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees charged");
    }

    @Override
    public void debitAmountFromSenderAccount() {
        System.out.println("Debit logic of PayToMerchant");
    }

    @Override
    public void creditAmountToReceiverAccount() {
        System.out.println("Credit logic of PayToMerchant");
    }
}

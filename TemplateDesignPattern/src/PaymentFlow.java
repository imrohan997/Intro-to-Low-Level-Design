public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmountFromSenderAccount();
    public abstract void creditAmountToReceiverAccount();


    public final void sendMoney() {
        //step 1
        validateRequest();
        //step 2
        calculateFees();
        //step 3
        debitAmountFromSenderAccount();
        //step 4
        creditAmountToReceiverAccount();
    }
}

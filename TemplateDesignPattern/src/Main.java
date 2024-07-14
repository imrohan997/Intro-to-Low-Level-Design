
public class Main {
    public static void main(String[] args) {
        PaymentFlow payToPerson = new PaymentToPerson();
        payToPerson.sendMoney();

        System.out.println("-------------------");

        PaymentFlow payToMerchant = new PaymentToMerchant();
        payToMerchant.sendMoney();
    }
}
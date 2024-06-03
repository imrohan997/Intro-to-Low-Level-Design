import Observable.IPhoneObservable;
import Observer.EmailAlertObserver;

public class Main {
    public static void main(String[] args) {

        IPhoneObservable iPhoneObservable = new IPhoneObservable();

        EmailAlertObserver emailAlertObserver1 = new EmailAlertObserver("abc@email.com");
        EmailAlertObserver emailAlertObserver2 = new EmailAlertObserver("def@email.com");
        EmailAlertObserver emailAlertObserver3 = new EmailAlertObserver("ghi@email.com");

        iPhoneObservable.add(emailAlertObserver1);
        iPhoneObservable.add(emailAlertObserver2);
        iPhoneObservable.add(emailAlertObserver3);

        iPhoneObservable.addItem(10);
        iPhoneObservable.addItem(20);
    }
}
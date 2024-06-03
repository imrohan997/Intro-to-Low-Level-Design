package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    String emailId;

    public EmailAlertObserver(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void update(StockObservable stockObservable) {
        sendEmail(emailId);
    }

    public void sendEmail(String emailId) {
        System.out.println(emailId + " : stock is available");
    }
}

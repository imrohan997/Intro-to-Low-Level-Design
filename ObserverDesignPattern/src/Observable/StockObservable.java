package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscriber();
     void addItem(int newStock);
}

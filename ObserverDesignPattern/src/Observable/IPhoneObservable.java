package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements StockObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int count  = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifySubscriber() {
        for(NotificationAlertObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void addItem(int newStock) {
        if(count == 0) {
            notifySubscriber();
        }
        count = count + newStock;
    }
}

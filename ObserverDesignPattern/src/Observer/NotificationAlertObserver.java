package Observer;


import Observable.StockObservable;

public interface NotificationAlertObserver {

    void update(StockObservable stockObservable);
}

package Observable;

import Observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);

    void notifyObserver();
    void setData(int newAddedStock);



}

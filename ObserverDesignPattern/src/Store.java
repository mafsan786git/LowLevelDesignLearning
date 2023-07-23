import Observable.IphoneObservableImpl;
import Observable.StocksObservable;
import Observer.EmailAlertObserverImpl;
import Observer.MobileAlertObserverImpl;
import Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservableImpl();
        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("afsan78692@gmail.com",stocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("mafsan78692@gmail.com",stocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("9889836480",stocksObservable);
        stocksObservable.add(observer1);
        stocksObservable.add(observer2);
        stocksObservable.add(observer3);

        stocksObservable.setData(10);
        stocksObservable.setData(0);
        stocksObservable.setData(10);
    }
}
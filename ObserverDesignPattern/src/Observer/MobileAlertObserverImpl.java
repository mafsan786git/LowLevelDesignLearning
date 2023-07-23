package Observer;

import Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    String mobile;
    StocksObservable observable;

    public MobileAlertObserverImpl(String mobile,StocksObservable observable){
        this.mobile = mobile;
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("Sent text message to : "+ mobile);
    }
}

package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

import static java.util.Objects.nonNull;

public class IphoneObservableImpl implements StocksObservable {
    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        if (!this.observerList.isEmpty()) {
            this.observerList.remove(observer);
        }
    }

    @Override
    public void notifyObserver() {
        for (NotificationAlertObserver observer : observerList){
            if (nonNull(observer)){
                observer.update();
            }
        }

    }

    @Override
    public void setData(int newAddedStock) {
        if (stockCount == 0 && newAddedStock > 0){
            notifyObserver();
        }
        if (newAddedStock == 0){
            stockCount = 0;
        }else {
            stockCount = stockCount + newAddedStock;
        }
    }
}

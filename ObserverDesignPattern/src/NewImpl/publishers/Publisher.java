package NewImpl.publishers;

import NewImpl.subscribers.Subscriber;

public interface Publisher {
    void registerSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void notifySubscribers();

}

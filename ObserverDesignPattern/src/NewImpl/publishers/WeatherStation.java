package NewImpl.publishers;

import NewImpl.subscribers.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Publisher {
    private List<Subscriber> subscribersList;
    private float temperature;
    private float humidity;
    private float pressure;


    public WeatherStation(){
        this.subscribersList = new ArrayList<>();
    }
    @Override
    public void registerSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribersList.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribersList){
            subscriber.update(temperature, humidity, pressure);
        }
    }

    public void setMeasurement(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    private void measurementChanged(){
        notifySubscribers();
    }
}

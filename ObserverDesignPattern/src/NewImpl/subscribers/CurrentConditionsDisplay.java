package NewImpl.subscribers;

public class CurrentConditionsDisplay implements Subscriber {
    private float temperature;
    private float humidity;

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    private void display(){
        System.out.println("Current conditions: " + temperature + "°F and " + humidity + "% humidity");
    }
}

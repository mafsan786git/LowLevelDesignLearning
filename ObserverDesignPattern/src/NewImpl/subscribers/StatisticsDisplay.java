package NewImpl.subscribers;

public class StatisticsDisplay implements Subscriber {
    private float maxTemperature  = 0.0f;
    private float minTemperature  = 200;
    private float temperatureSum  = 200;
    private int numReadings;
    @Override
    public void update(float temperature, float humidity, float pressure) {
        temperatureSum += temperature;
        numReadings++;

        if (temperature > maxTemperature){
            maxTemperature = temperature;
        }

        if (temperature < minTemperature){
            minTemperature = temperature;
        }

        displayStatistics();
    }

    private void displayStatistics() {
        float averageTemperature = temperatureSum / numReadings;
        System.out.println("Statistics: " +
                "Avg/Max/Min temperature = " + averageTemperature + "/" + maxTemperature + "/" + minTemperature);
    }


}

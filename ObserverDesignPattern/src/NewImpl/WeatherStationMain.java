package NewImpl;

import NewImpl.publishers.WeatherStation;
import NewImpl.subscribers.CurrentConditionsDisplay;
import NewImpl.subscribers.StatisticsDisplay;

public class WeatherStationMain {
    public static void main(String[] args){

        //Create publisher
        WeatherStation weatherStation = new WeatherStation();

        //Create subscribers
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        StatisticsDisplay statisticsDisplay  =  new StatisticsDisplay();
        weatherStation.registerSubscriber(currentDisplay);
        weatherStation.registerSubscriber(statisticsDisplay);


        //Simulate new weather measurements
        weatherStation.setMeasurement(28.5f, 65f, 1013f);
        weatherStation.setMeasurement(29.0f, 70f, 1015f);
        weatherStation.setMeasurement(27.8f, 68f, 1013f);

    }
}

package reciever;

public class AirConditioner {
    boolean isOn;
    int temperature;

    public void turnOnAc(){
        this.isOn = true;
        System.out.println("Ac turn on");
    }

    public void turnOffAc(){
        this.isOn = false;
        System.out.println("Ac turn off");
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

}

import command.TurnOnAcCommand;
import invoker.MyRemoteControl;
import reciever.AirConditioner;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl myRemoteControl = new MyRemoteControl();
        myRemoteControl.setCommand(new TurnOnAcCommand(airConditioner));
        myRemoteControl.pressButton();
        myRemoteControl.undo();
    }
}
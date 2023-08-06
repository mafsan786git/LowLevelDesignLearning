package command;

import reciever.AirConditioner;

public class TurnOffAcCommand implements ICommand {

    AirConditioner airConditioner;
    public TurnOffAcCommand(AirConditioner airConditioner){
        this.airConditioner = airConditioner;
    }
    @Override
    public void execute() {
        airConditioner.turnOffAc();
    }

    @Override
    public void undo(){
        airConditioner.turnOnAc();
    }
}

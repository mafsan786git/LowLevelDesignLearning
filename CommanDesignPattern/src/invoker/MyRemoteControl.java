package invoker;

import command.ICommand;

import java.util.Stack;

public class MyRemoteControl {
    ICommand command;
    Stack<ICommand> acCommandHistory = new Stack<>();
    public MyRemoteControl(){
    }

    public void setCommand(ICommand iCommand){
        this.command  = iCommand;
    }

    public void pressButton(){
        this.command.execute();
        acCommandHistory.push(command);
    }

    public void undo(){
        if (!acCommandHistory.isEmpty()){
            ICommand lastCommand = acCommandHistory.pop();
            lastCommand.undo();
        }
    }
}

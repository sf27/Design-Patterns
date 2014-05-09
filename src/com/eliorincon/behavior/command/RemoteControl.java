package command;

//Invoker
public class RemoteControl {

    private Command command;

    public RemoteControl() {
        command = null;
    }

    public RemoteControl(Command newCommand) {
        command = newCommand;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }

    public void undoButton() {
        command.undo();
    }

}

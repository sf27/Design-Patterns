package command;

//Concrete Command
public class LightOff implements Command {

    private Light light;

    public LightOff(Light newLight) {
        light = newLight;
    }

    @Override
    public void execute() {
        light.setOff();

    }

    @Override
    public void undo() {
        light.setOn();

    }

}
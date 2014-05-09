package command;

//Concrete Command
public class LightOn implements Command {

    private Light light;

    public LightOn(Light newLight) {
        light = newLight;
    }

    @Override
    public void execute() {
        light.setOn();

    }

    @Override
    public void undo() {
        light.setOff();

    }

}

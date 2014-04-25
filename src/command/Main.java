package command;

public class Main {

    public static void main(String[] args) {

        // Light light = new Light();
        //
        // Command lightOn = new LightOn(light);
        //
        // Command lightOff = new LightOff(light);
        //
        // RemoteControl controlOn = new RemoteControl(lightOn);
        //
        // RemoteControl controlOff = new RemoteControl(lightOff);
        //
        // controlOff.pressButton();
        //
        // controlOn.pressButton();

        // //////////////////////////////////////////////////////////////

        RemoteControl remoteControl = new RemoteControl();

        Light light = new Light();

        Command DoorLightOn = new LightOn(light);

        Command DoorLightOff = new LightOff(light);

        // Command KitchenlightOff = new KitchenLightOff(light);

        // Command KitchenlightOn = new KitchenLightOn(light);

        // Command BedRoomlightOff = new BedRoomLightOff(light);

        // Command BedRoomlightOn = new BedRoomLightOn(light);

        remoteControl.setCommand(DoorLightOn);
        remoteControl.pressButton();
        remoteControl.undoButton();

        remoteControl.setCommand(DoorLightOff);
        remoteControl.pressButton();
        remoteControl.undoButton();

    }

}

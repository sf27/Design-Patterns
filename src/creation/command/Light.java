package command;

//Receiver
public class Light {

    public boolean on;

    public void setOn() {
        this.on = true;
        System.out.println("Lights On");
    }

    public void setOff() {
        this.on = false;
        System.out.println("Lights Off");
    }

}

package adapter;

public class MyCar implements Car {

    @Override
    public void start() {
        System.out.println("start the car");

    }

    @Override
    public void stop() {
        System.out.println("Stop the car");
    }

}

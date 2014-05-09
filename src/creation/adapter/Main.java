package adapter;

public class Main {

    public static void main(String[] args) {
        MyCar car = new MyCar();
        car.start();
        car.stop();

        PersonAdapter adapterOne = new PersonAdapter();
        adapterOne.start();
        adapterOne.stop();

        Person person = new Person();
        PersonAdapter adapterTwo = new PersonAdapter(person);
        adapterTwo.start();
        adapterTwo.stop();
    }
}

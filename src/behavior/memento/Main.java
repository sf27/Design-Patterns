package memento;

public class Main {

    public static void main(String[] args) {

        CareTaker careTaker = new CareTaker();

        Originator originator = new Originator();
        originator.setData("key of wifi network: smile");

        Memento keyWifi = originator.createMemento();

        careTaker.addMemento(keyWifi);

        originator.setData("new key of wifi network: love");
        originator.setData("new key of wifi network: christmas");

        careTaker.addMemento(originator.createMemento());

        System.out.println("" + careTaker.getMemento(0).getData());
        System.out.println("" + careTaker.getMemento(1).getData());
        // System.out.println("" + careTaker.getMemento(2).getData());

    }
}

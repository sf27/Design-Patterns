package memento;

public class Originator {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Memento createMemento() {
        return new Memento(data);
    }

    public void restoreMemento(Memento m) {
        data = m.getData();
    }

}

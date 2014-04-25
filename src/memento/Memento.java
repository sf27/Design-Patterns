package memento;

public class Memento {

    private String data;

    public Memento(String newData) {
        this.data = newData;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

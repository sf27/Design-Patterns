package composite;

public abstract class Component {

    public void add(Component newNode) {
        throw new UnsupportedOperationException();
    }

    public void remove(int index) {
        throw new UnsupportedOperationException();
    }

    public Component getComponent(int index) {
        throw new UnsupportedOperationException();
    }

    public void displayInfo() {
        throw new UnsupportedOperationException();
    }

    public String getOperandX() {
        throw new UnsupportedOperationException();
    }

    public String getOperator() {
        throw new UnsupportedOperationException();
    }

    public String getOperandY() {
        throw new UnsupportedOperationException();
    }

}

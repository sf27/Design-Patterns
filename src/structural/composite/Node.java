package composite;

public class Node extends Component {

    String operandX, operandY;

    public Node(String newOperandX, String newOperandY) {
        this.operandX = newOperandX;
        this.operandY = newOperandY;
    }

    @Override
    public void displayInfo() {
        System.out.println("X= " + getOperandX() + "  Y=" + getOperandY());
    }

    public String getOperandX() {
        return operandX;
    }

    public void setOperandX(String operandX) {
        this.operandX = operandX;
    }

    public String getOperandY() {
        return operandY;
    }

    public void setOperandY(String operandY) {
        this.operandY = operandY;
    }

}

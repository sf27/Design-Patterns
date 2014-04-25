package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class Tree extends Component {

    ArrayList<Component> nodes = new ArrayList<>();

    String               operator;

    public Tree(String newOperator) {
        this.operator = newOperator;
    }

    @Override
    public void add(Component newNode) {
        // TODO Auto-generated method stub
        nodes.add(newNode);
    }

    @Override
    public void remove(int index) {
        // TODO Auto-generated method stub
        nodes.remove(index);
    }

    @Override
    public Component getComponent(int index) {
        // TODO Auto-generated method stub
        return nodes.get(index);
    }

    @Override
    public void displayInfo() {
        System.out.println("Root: " + getOperator());
        System.out.println("Nodes: ");

        Iterator<Component> nodeList = nodes.iterator();

        while (nodeList.hasNext()) {
            Component aux = nodeList.next();
            aux.displayInfo();
        }

        System.out.println("\n");
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

}

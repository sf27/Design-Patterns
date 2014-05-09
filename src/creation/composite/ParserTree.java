package composite;

public class ParserTree {

    public static void main(String[] args) {

        Tree tree = new Tree("=");

        Node a = new Node("4", "6");
        Node b = new Node("5", "7");

        tree.add(a);
        tree.add(b);

        Tree tree2 = new Tree("*");
        Node c = new Node("77", "567");
        Node d = new Node("34", "23");
        tree2.add(c);
        tree2.add(d);
        
        tree.add(tree2);

        tree.displayInfo();
    }

}

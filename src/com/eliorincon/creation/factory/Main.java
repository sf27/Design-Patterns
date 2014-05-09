package factory;

import factory.FactoryOperation.OPERATIONS;

import static factory.FactoryOperation.makeOperation;

public class Main {
    public static void main(String[] args) {

        Operation operation = null;

        operation = makeOperation(OPERATIONS.ADD);
        System.out.println("Operation: " + operation.getOperation());

        operation = makeOperation(OPERATIONS.SUBTRACT);
        System.out.println("Operation: " + operation.getOperation());

        operation = makeOperation(OPERATIONS.MULTIPLY);
        System.out.println("Operation: " + operation.getOperation());

        operation = makeOperation(OPERATIONS.DIVIDE);
        System.out.println("Operation: " + operation.getOperation());

    }

}

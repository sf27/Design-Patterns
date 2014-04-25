package bridge;

public class CalculatorMarket implements Calculator {

    private Operation operation;

    public CalculatorMarket(Operation newOperation) {
        operation = newOperation;
    }

    @Override
    public void executeOperation() {
        operation.execute();

    }

}

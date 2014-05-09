package factory;

public abstract class Operation {

    private String operation;

    public Operation() {
        setOperation("");
    }

    public Operation(String newOperation) {
        this.operation = newOperation;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

}

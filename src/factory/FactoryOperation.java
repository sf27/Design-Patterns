package factory;

public class FactoryOperation {

    enum OPERATIONS {
        ADD, SUBTRACT, MULTIPLY, DIVIDE
    }

    public static Operation makeOperation(OPERATIONS typeOperation) {
        Operation operation = null;
        switch (typeOperation) {
        case ADD:
            operation = new AddOperation();
            break;
        case SUBTRACT:
            operation = new SubtractOperation();
            break;
        case MULTIPLY:
            operation = new MultiplyOperation();
            break;
        case DIVIDE:
            operation = new DivideOperation();
            break;
        }
        return operation;
    }
}

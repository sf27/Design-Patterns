package bridge;

public class Main {

    public static void main(String[] args) {

        Operation add = new Add();
        Operation subtract = new Subtract();

        CalculatorMarket calculatorMarket1 = new CalculatorMarket(add);
        calculatorMarket1.executeOperation();

        CalculatorMarket calculatorMarket2 = new CalculatorMarket(subtract);
        calculatorMarket2.executeOperation();

        // ////////////////////////////////////////////////////////////////////////////7

        Operation[] operations = { add, subtract };
        CalculatorMarket calculator;

        for (Operation operation : operations) {
            calculator = new CalculatorMarket(operation);
            calculator.executeOperation();
        }

    }
}

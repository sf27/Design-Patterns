package mediator;

public class Main {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();

        PersonA a = new PersonA(mediator);

        PersonB b = new PersonB(mediator);

        a.action();

        b.action();
    }
}

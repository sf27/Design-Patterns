package mediator;

public class ConcreteMediator implements Mediator {

    Colleague a, b;

    @Override
    public void fight() {
        System.out.println("Mediator is fighting");
    }

    @Override
    public void talk() {
        System.out.println("Mediator is talking");
    }

    @Override
    public void registerPersonA(Colleague newA) {
        a = newA;

    }

    @Override
    public void registerPersonB(Colleague newB) {
        b = newB;
    }

}

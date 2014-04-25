package mediator;

public class PersonB implements Colleague {

    private Mediator mediator;

    public PersonB(Mediator newMediator) {
        this.mediator = newMediator;
        this.mediator.registerPersonB(this);
    }

    @Override
    public void action() {
        // TODO Auto-generated method stub
        mediator.talk();
    }
}

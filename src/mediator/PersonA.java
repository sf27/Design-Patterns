package mediator;

public class PersonA implements Colleague {

    private Mediator mediator;

    public PersonA(Mediator newMediator) {
        this.mediator = newMediator;
        this.mediator.registerPersonA(this);
    }

    @Override
    public void action() {
        // TODO Auto-generated method stub
        mediator.fight();
    }

}

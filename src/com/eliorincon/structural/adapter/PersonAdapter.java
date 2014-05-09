package adapter;

public class PersonAdapter implements Car {

    private Person person;

    public PersonAdapter() {
        this.person = new Person();
    }

    public PersonAdapter(Person newPerson) {
        this.person = newPerson;
    }

    @Override
    public void start() {
        this.person.walk();
    }

    @Override
    public void stop() {
        this.person.stop();
    }

}

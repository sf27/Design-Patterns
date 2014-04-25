package facade;

public class Main {

    public static void main(String[] args) {
        FacadeLogin sf27 = new FacadeLogin("sf27", "1234");

        sf27.logIn();

        FacadeLogin eliosf27 = new FacadeLogin("eliosf27", "27");

        eliosf27.logIn();
    }
}

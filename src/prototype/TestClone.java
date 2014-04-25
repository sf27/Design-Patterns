package prototype;

public class TestClone {

    public static void main(String[] args) {

        CloneFactory cloneFactory = new CloneFactory();

        Sheep sheepObject = new Sheep();

        Animal cloneObject = (Sheep) cloneFactory.getClone(sheepObject);

        System.out.println(cloneObject);

        System.out.println(sheepObject);

    }
}

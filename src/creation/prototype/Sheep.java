package prototype;

public class Sheep implements Animal {

    public Sheep() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public Animal makeCopy() {
        Sheep object = null;

        try {
            object = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return object;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sheep Dolly";
    }

}

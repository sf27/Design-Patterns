package singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    
    //is private to avoid new instances 
    private Singleton() {
    }

    
    // its static because this way, the object persist the instance everytime in the jvm
    public static Singleton getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Singleton();
        }

        return INSTANCE;

    }

}

package template;

public abstract class Parser {
    
    public void execute() {
        System.out.println("\nBefore execute");
        configuration();
        System.out.println("After execute\n");
    }

    public abstract void configuration();
}

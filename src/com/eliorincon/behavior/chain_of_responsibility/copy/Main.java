package chain_of_responsibility.copy;

public class Main {

    public static void main(String[] args) {
        DnsFinder finder = new DnsFinder();
        finder.findDns("open");
        finder.findDns("google");
        finder.findDns("att");
        finder.findDns("openDontKnowDns");
    }
}

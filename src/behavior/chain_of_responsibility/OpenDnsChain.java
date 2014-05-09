package chain_of_responsibility;

public class OpenDnsChain implements Chain {

    private static final String dns = "OPEN";
    private Chain               nextChain;

    @Override
    public void next(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void findDns(String name) {
        // TODO Auto-generated method stub
        if (name.equalsIgnoreCase(dns)) {
            System.out.println(this.getClass().getName() + " dns is: 67.215.71.202");
        } else {
            nextChain.findDns(name);
        }
    }
}

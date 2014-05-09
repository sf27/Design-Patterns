package chain_of_responsibility.copy;

public class AttDnsChain implements Chain {

    private static final String dns = "ATT";
    private Chain               nextChain;

    @Override
    public void next(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void findDns(String name) {
        // TODO Auto-generated method stub
        if (name.equalsIgnoreCase(dns)) {
            System.out.println(this.getClass().getName() + " dns is: 68.94.156.1");
        } else {
            nextChain.findDns(name);
        }
    }

}

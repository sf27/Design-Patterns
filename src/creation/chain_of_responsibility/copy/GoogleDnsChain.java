package chain_of_responsibility.copy;

public class GoogleDnsChain implements Chain {

    private static final String dns = "GOOGLE";
    private Chain               nextChain;

    @Override
    public void next(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void findDns(String name) {
        // TODO Auto-generated method stub
        if (name.equalsIgnoreCase(dns)) {
            System.out.println(this.getClass().getName() + " dns is: 8.8.8.8");
        } else {
            nextChain.findDns(name);
        }
    }
}

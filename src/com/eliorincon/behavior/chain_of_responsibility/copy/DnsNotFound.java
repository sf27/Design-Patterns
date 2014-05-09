package chain_of_responsibility.copy;

public class DnsNotFound implements Chain {

    private Chain nextChain;

    @Override
    public void next(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void findDns(String name) {
        System.out.println("Dns not found");
    }
}

package chain_of_responsibility.copy;

public interface Chain {

    public void next(Chain newChain);

    public void findDns(String name);
}

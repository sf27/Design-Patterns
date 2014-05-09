package chain_of_responsibility;

public class DnsFinder implements Chain {

    private Chain nextChain;

    @Override
    public void next(Chain newChain) {
        this.nextChain = newChain;
    }

    @Override
    public void findDns(String name) {

        GoogleDnsChain googleDnsChain = new GoogleDnsChain();

        OpenDnsChain openDnsChain = new OpenDnsChain();

        AttDnsChain attDnsChain = new AttDnsChain();

        DnsNotFound notFound = new DnsNotFound();

        googleDnsChain.next(openDnsChain);
        openDnsChain.next(attDnsChain);
        attDnsChain.next(notFound);

        googleDnsChain.findDns(name);
    }

}

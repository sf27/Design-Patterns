package proxy;

public class ClientProxy implements ClientData {

    private ClientData client;

    public ClientProxy(ClientData newClient) {
        this.client = newClient;
    }

    @Override
    public String getClientName() {
        // TODO Auto-generated method stub
        return client.getClientName();
    }

    @Override
    public int getClientId() {
        // TODO Auto-generated method stub
        return client.getClientId();
    }

}

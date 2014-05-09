package proxy;

public class Main {

    public static void main(String[] args) {
        // the client can access to all the data
        Client client = new Client();
        client.setId("1");
        client.setName("Elio");
        client.setLast_name("Rincón");
        client.setAddress("Maracaibo");

        ClientProxy proxy = new ClientProxy(client);
        // limits access to the data.
        System.out.println(proxy.getClientId());
        System.out.println(proxy.getClientName());

    }
}

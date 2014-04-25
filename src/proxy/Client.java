package proxy;

public class Client implements ClientData {

    String name, last_name, id, address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getClientName() {
        // TODO Auto-generated method stub
        return name + " " + last_name;
    }

    @Override
    public int getClientId() {
        // TODO Auto-generated method stub
        return Integer.parseInt(id);
    }

}

package builder;

public interface BuilderPhone {

    public void buildWifi();

    public void buildBlueTooth();

    public void buildGPS();

    public void buildDataGsm();

    public Phone getPhone();

    /*
     * Extra code add for me
     */

    public void buildWifi(String wifi);

    public void buildBlueTooth(String bluetooth);

    public void buildGPS(String gps);

    public void buildDataGsm(String gsm);
}

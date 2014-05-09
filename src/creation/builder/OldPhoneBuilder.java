package builder;

public class OldPhoneBuilder implements BuilderPhone {

    private Phone phone;

    public OldPhoneBuilder(Phone newPhone) {
        this.phone = newPhone;
    }

    public OldPhoneBuilder() {
        this.phone = new Phone();
    }

    @Override
    public void buildWifi() {
        this.phone.setWifi("Wifi Network #1987");
    }

    @Override
    public void buildBlueTooth() {
        this.phone.setBluetooth("Bluetooth connection Huawei G510");
    }

    @Override
    public void buildGPS() {
        this.phone.setGps("GPS Latitud:34 Longitud:43");
    }

    @Override
    public void buildDataGsm() {
        this.phone.setDataGSM("Movistar GSM Network");
    }

    @Override
    public Phone getPhone() {
        return this.phone;
    }

    @Override
    public void buildWifi(String wifi) {
        this.phone.setWifi(wifi);
    }

    @Override
    public void buildBlueTooth(String bluetooth) {
        this.phone.setBluetooth(bluetooth);
    }

    @Override
    public void buildGPS(String gps) {
        this.phone.setGps(gps);
    }

    @Override
    public void buildDataGsm(String gsm) {
        this.phone.setDataGSM(gsm);
    }

}

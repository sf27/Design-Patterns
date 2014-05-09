package builder;

public class PhoneEngineer {

    private BuilderPhone oldPhoneBuilder;

    public PhoneEngineer(BuilderPhone builder) {
        this.oldPhoneBuilder = builder;
    }

    public void makePhone() {
        this.oldPhoneBuilder.buildWifi();
        this.oldPhoneBuilder.buildBlueTooth();
        this.oldPhoneBuilder.buildGPS();
        this.oldPhoneBuilder.buildDataGsm();
    }

    public Phone getPhone() {
        return this.oldPhoneBuilder.getPhone();
    }

    /*
     * Extra code add for me
     */

    public PhoneEngineer makeWifi(String newWifi) {
        this.oldPhoneBuilder.buildWifi(newWifi);
        return this;
    }

    public PhoneEngineer makeGPS(String newGPS) {
        this.oldPhoneBuilder.buildGPS(newGPS);
        return this;
    }

    public PhoneEngineer makeDataGSM(String newGSM) {
        this.oldPhoneBuilder.buildDataGsm(newGSM);
        return this;
    }

    public PhoneEngineer makeBlueTooth(String newBlueTooth) {
        this.oldPhoneBuilder.buildBlueTooth(newBlueTooth);
        return this;
    }

}

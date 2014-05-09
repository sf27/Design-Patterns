package builder;

public class Phone implements PhonePlan {

    String wifi, bluetooth, gps, dataGSm;

    @Override
    public void setWifi(String newWifi) {
        this.wifi = newWifi;
    }
    
    public String getWifi() {
        return this.wifi;
    }

    @Override
    public void setBluetooth(String newBluetooth) {
        this.bluetooth = newBluetooth;
    }
    
    public String getBluetooth() {
        return this.bluetooth;
    }

    @Override
    public void setGps(String newGps) {
        this.gps = newGps;
    }

    public String getGps() {
        return this.gps;
    }
    
    @Override
    public void setDataGSM(String newDataGsm) {
        this.dataGSm = newDataGsm;
    }
    
    public String getDataGSm() {
        return this.dataGSm;
    }

}

package builder;

public class Main {

    public static void main(String[] args) {
        BuilderPhone builderPhone = new OldPhoneBuilder();

        PhoneEngineer engineer = new PhoneEngineer(builderPhone);

        engineer.makePhone();

        Phone newPhoneElio = engineer.getPhone();

        System.out.println("Builder Pattern Design: newPhoneElio");

        System.out.println("Wifi: " + newPhoneElio.getWifi());
        System.out.println("BLUETOOTH: " + newPhoneElio.getBluetooth());
        System.out.println("GPS: " + newPhoneElio.getGps());
        System.out.println("GSM: " + newPhoneElio.getDataGSm());

        System.out.println("\nBuilder Pattern Design: newPhone");
        
        Phone newPhone = engineer.makeBlueTooth("bluetooth").makeDataGSM("gsm").makeGPS("gps").makeWifi("wifi").getPhone();

        System.out.println("Wifi: " + newPhone.getWifi());
        System.out.println("BLUETOOTH: " + newPhone.getBluetooth());
        System.out.println("GPS: " + newPhone.getGps());
        System.out.println("GSM: " + newPhone.getDataGSm());

    }

}

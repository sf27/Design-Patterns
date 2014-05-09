package strategy;

public class Main {

    public static void main(String[] args) {

        BuildingEntity building = new BuildingEntity(1, "High Location");

        CarEntity car = new CarEntity(2, "Low location");

        System.out.println("Building location: " + building.getLocation());

        System.out.println("Car location: " + car.getLocation());

        car.setStrategyType(new LocationMiami());

        System.out.println("Car location: " + car.getLocation());

        Entity car2 = new CarEntity(3, "Middle location");

        // car2 doesn't have the attribute getLocation because is an entity
        // object and not an CarEntity object
        // System.out.println("Car location: " + car2.getLocation());
    }

}

package strategy;

public class CarEntity extends Entity {

    strategy.LocationStrategy StrategyType;

    public CarEntity(int newID, String newDescription) {
        super(newID, newDescription);

        StrategyType = new LocationMaracaibo();
    }

    public void setStrategyType(strategy.LocationStrategy strategyType) {
        StrategyType = strategyType;
    }

    public strategy.LocationStrategy getStrategyType() {
        return StrategyType;
    }

    public String getLocation() {
        return StrategyType.Location();
    }

}

package strategy;

public class BuildingEntity extends Entity {

    strategy.LocationStrategy StrategyType;
    
    public BuildingEntity(int newID, String newDescription) {
        super(newID, newDescription);
        
        StrategyType = new LocationMiami();
    }
    
    public void setStrategyType(strategy.LocationStrategy strategyType) {
        StrategyType = strategyType;
    }
    
    public strategy.LocationStrategy getStrategyType() {
        return StrategyType;
    }
    
    public String getLocation(){
        return StrategyType.Location();
    }

}

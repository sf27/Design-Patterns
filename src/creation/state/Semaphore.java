package state;

public class Semaphore {

    RedLightSemaphoreState    redLightSemaphoreState;
    OrangeLightSemaphoreState orangeLightSemaphoreState;
    GreenLightSemaphoreState  greenLightSemaphoreState;

    SemaphoreState            currentState;

    public Semaphore() {
        redLightSemaphoreState = new RedLightSemaphoreState(this);
        orangeLightSemaphoreState = new OrangeLightSemaphoreState(this);
        greenLightSemaphoreState = new GreenLightSemaphoreState(this);

        currentState = greenLightSemaphoreState;
    }

    public SemaphoreState getCurrentState() {
        return currentState;
    }

    public void setCurrentState(SemaphoreState currentState) {
        this.currentState = currentState;
    }

    public boolean isGreenLight() {
        return currentState.isGreedLight();
    }

    public boolean isRedLight() {
        return currentState.isRedLight();
    }

    public boolean isOrangeLight() {
        return currentState.isOrangeLight();
    }
}

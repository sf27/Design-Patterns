package state;

public class RedLightSemaphoreState implements SemaphoreState {

    private Semaphore semaphore;

    public RedLightSemaphoreState(Semaphore newSemaphore) {
        this.semaphore = newSemaphore;
    }

    @Override
    public boolean isGreedLight() {
        return false;
    }

    @Override
    public boolean isRedLight() {
        // TODO Auto-generated method stub
        return true;
    }

    @Override
    public boolean isOrangeLight() {
        // TODO Auto-generated method stub
        return false;
    }

}

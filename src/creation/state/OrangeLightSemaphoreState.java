package state;

public class OrangeLightSemaphoreState implements SemaphoreState {

    private Semaphore semaphore;

    public OrangeLightSemaphoreState(Semaphore newSemaphore) {
        this.semaphore = newSemaphore;
    }

    @Override
    public boolean isGreedLight() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isRedLight() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isOrangeLight() {
        // TODO Auto-generated method stub
        return true;
    }

}

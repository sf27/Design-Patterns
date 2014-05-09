package state;

public class Main {

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        // semaphore.setCurrentState(new OrangeLightSemaphoreState(semaphore));
        semaphore.setCurrentState(new RedLightSemaphoreState(semaphore));
        // semaphore.setCurrentState(new GreenLightSemaphoreState(semaphore));
        SemaphoreState state = semaphore.getCurrentState();
        if (state.isGreedLight()) {
            System.out.println("Cross");
        } else if (state.isOrangeLight()) {
            System.out.println(" Cross with caution");
        } else if (state.isRedLight()) {
            System.out.println("Do not cross");
        }

    }
}

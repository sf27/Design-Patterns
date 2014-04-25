package observer;

public class StockObserver implements Observer {

    private Subject stockgrabber;
    private int     score;

    public StockObserver(Subject stockGrabber) {

        this.stockgrabber = stockGrabber;

        stockGrabber.register(this);
    }

    @Override
    public void updates(int newScore) {
        this.score = newScore;

        printScore();
    }

    private void printScore() {
        System.out.println("Updates score: " + this.score);
    }

}

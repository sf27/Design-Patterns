package observer;

public class GrabStocks {

    
    public static void main(String[] args) {
        StockGrabber grabber = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(grabber);
        grabber.setScore(28);
        StockObserver observer2 = new StockObserver(grabber);
        grabber.setScore(29);
        StockObserver observer3 = new StockObserver(grabber);
        grabber.setScore(30);
        StockObserver observer4 = new StockObserver(grabber);
        grabber.setScore(31);
        StockObserver observer5 = new StockObserver(grabber);
        grabber.setScore(32);
        StockObserver observer6 = new StockObserver(grabber);
        grabber.setScore(33);
        StockObserver observer7 = new StockObserver(grabber);
        grabber.setScore(34);
    }
}

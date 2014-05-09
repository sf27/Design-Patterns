package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

    private ArrayList<Observer> observers = new ArrayList<>();
    private int                 score;

    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);
    }

    @Override
    public void unregister(Observer deleteObserver) {
        int index = observers.indexOf(deleteObserver);
        observers.remove(index);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.updates(this.score);
        }
    }

    public void setScore(int score) {
        this.score = score;

        notifyObserver();
    }

}

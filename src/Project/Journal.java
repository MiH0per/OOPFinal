package Project;

import java.util.ArrayList;

class Journal {
	private ArrayList<Observer> subscribers;

    public Journal() {
        this.subscribers = new ArrayList<>();
    }

    public void subscribeToJournal(Observer observer) {
        subscribers.add(observer);
    }

    public void notifyObservers() {
        for (Observer observer : subscribers) {
            observer.update();
        }
    }
}

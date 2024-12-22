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
    public void deleteFromJournal(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifyObservers(String article) {
        System.out.println(Translator.translate("publishingArticle", Main.language) + ": " + article);
        for (Observer observer : subscribers) {
            observer.update(article);
        }
    }
}

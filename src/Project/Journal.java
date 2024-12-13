package Project;

class Journal {
    private Observer[] subscribers;

    public Journal(Observer[] subscribers) {
        this.subscribers = subscribers;
    }

    public void subscribeToJournal(Observer observer) {}
    public void deleteFromJournal(Observer observer) {}
    public void notifyObservers() {}
}

package designPatterns.observerPattern.observable;

import designPatterns.observerPattern.observer.NotificationAlertObserver;

public interface StocksObservable {
    void addObserver(NotificationAlertObserver observer);

    void removeObserver(NotificationAlertObserver observer);

    void notifyObservers();

    void setStock(Integer newStock);

    int getStock();
}

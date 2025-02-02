package designPatterns.observerPattern.observable;

import designPatterns.observerPattern.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();

    int stock;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (NotificationAlertObserver observer : observers) {
            observer.update();
        }
    }

    @Override
    public void setStock(Integer newStock) {
        if (stock == 0) {
//            notify only when first time stock is added
            notifyObservers();
        }
        stock += newStock;
    }

    @Override
    public int getStock() {
        return stock;
    }
}

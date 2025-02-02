package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.observable.StocksObservable;

public class EmailAlertObserver implements NotificationAlertObserver{

    StocksObservable stocksObservable;
    String email;

    public EmailAlertObserver(StocksObservable stocksObservable, String email) {
        this.stocksObservable = stocksObservable;
        this.email = email;
    }

    @Override
    public void update() {
        sendEmail(email, stocksObservable.getStock());
    }

    private void sendEmail(String email, int stock) {
        System.out.println("Sending email to " + email + " with stock " + stock);
    }
}

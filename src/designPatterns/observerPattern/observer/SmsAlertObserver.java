package designPatterns.observerPattern.observer;

import designPatterns.observerPattern.observable.StocksObservable;

public class SmsAlertObserver implements NotificationAlertObserver {

    StocksObservable stocksObservable;
    String phoneNumber;

    public SmsAlertObserver(StocksObservable stocksObservable, String phoneNumber) {
        this.stocksObservable = stocksObservable;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update() {
        sendSms(phoneNumber, stocksObservable.getStock());
    }

    private void sendSms(String phoneNumber, int stock) {
        System.out.println("Sending sms to " + phoneNumber + " with stock " + stock);
    }
}

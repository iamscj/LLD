package designPatterns.observerPattern;

import designPatterns.observerPattern.observable.IphoneObservableImpl;
import designPatterns.observerPattern.observable.StocksObservable;
import designPatterns.observerPattern.observer.EmailAlertObserver;
import designPatterns.observerPattern.observer.SmsAlertObserver;

public class Stock {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IphoneObservableImpl();

        EmailAlertObserver emailAlertObserver1 = new EmailAlertObserver(stocksObservable, "abc@gmail.com");
        EmailAlertObserver emailAlertObserver2 = new EmailAlertObserver(stocksObservable, "def@gmail.com");
        SmsAlertObserver smsAlertObserver = new SmsAlertObserver(stocksObservable, "12345");

        stocksObservable.addObserver(emailAlertObserver1);
        stocksObservable.addObserver(emailAlertObserver2);
        stocksObservable.addObserver(smsAlertObserver);

        stocksObservable.setStock(12);
        stocksObservable.setStock(13);
//        Output:
//        Sending email to abc@gmail.com with stock 12
//        Sending email to def@gmail.com with stock 12
//        Sending sms to 12345 with stock 12
    }
}

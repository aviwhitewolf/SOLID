package Observer.StockTrading.services;

import Observer.StockTrading.Observer;
import Observer.StockTrading.utils.NotificationUtils;

public class SmsService implements Observer {
    public void sendSMS(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendSms(subject, message);
    }

    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        sendSMS(stockName, currentPrice);
    }
}

package Observer.StockTrading.services;

import Observer.StockTrading.Observer;
import Observer.StockTrading.utils.NotificationUtils;

public class EmailService implements Observer {
    public void sendEmail(String stockName, double currentPrice) {
        String subject = "Price update for " + stockName;
        String message = "New price is " + currentPrice;
        NotificationUtils.sendEmail(subject, message);
    }

    @Override
    public void notifyObserver(String stockName, double currentPrice) {
        sendEmail(stockName, currentPrice);
    }
}

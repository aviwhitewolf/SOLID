package Observer.StockTrading;

public interface Observer {
    void notifyObserver(String stockName, double currentPrice);
}
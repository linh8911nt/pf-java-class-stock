public class Stock {
    String symbolStocks;
    String nameStocks;
    double previousClosingPrice;
    double currentPrice;

    public Stock(String symbolStocks, String nameStocks) {
        this.symbolStocks = symbolStocks;
        this.nameStocks = nameStocks;
    }

    public Stock(double previousClosingPrice, double currentPrice) {
        this.previousClosingPrice = previousClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent() {
        return ((this.currentPrice - this.previousClosingPrice) / this.previousClosingPrice) * 100;
    }
}

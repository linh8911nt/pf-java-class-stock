import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void getChangePercent() {
        String symbolStocks = "ORCL";
        String nameStocks = "Oracle Corporation";
        double previousClosingPrice = 34.5;
        double currentPrice = 34.35;
        Stock stocks = new Stock(previousClosingPrice, currentPrice);

        double expected = -0.434782608695648;
        double result = stocks.getChangePercent();
        assertEquals(expected, result);
    }
}
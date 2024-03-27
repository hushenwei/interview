import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class SellTrade {

    /**
     *
     * @param costMethod cost calculation method: A = Average; I = Identical
     * @param sharesToSell total shares need to sell
     * @param tradeList all trade list
     * @return
     */
    public List<Sell> process(String costMethod, BigDecimal sharesToSell, List<Trade> tradeList) {
        // TODO:
    }

    class Sell {
        BigDecimal cost;

        public BigDecimal getCost() {
            return cost;
        }

        public void setCost(BigDecimal cost) {
            this.cost = cost;
        }
    }

    class Trade {
        int shares;
        BigDecimal cost;
        LocalDate tradeDate;

        public int getShares() {
            return shares;
        }

        public void setShares(int shares) {
            this.shares = shares;
        }

        public BigDecimal getCost() {
            return cost;
        }

        public void setCost(BigDecimal cost) {
            this.cost = cost;
        }

        public LocalDate getTradeDate() {
            return tradeDate;
        }

        public void setTradeDate(LocalDate tradeDate) {
            this.tradeDate = tradeDate;
        }
    }
}

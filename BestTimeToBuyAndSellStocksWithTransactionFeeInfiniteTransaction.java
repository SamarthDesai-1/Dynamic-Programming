public class BestTimeToBuyAndSellStocksWithTransactionFeeInfiniteTransaction {

  public static void main(String[] args) {
    int[] prices = { 1, 3, 2, 8, 4, 9 };
    final int fee = 2;

    int buyStateProfit = -prices[0];
    int sellStateProfit = 0;

    for (int i = 1; i < prices.length; i++) {
      int newBuyStateProfit = 0;
      int newSellStateProfit = 0;

      if (sellStateProfit - prices[i] > buyStateProfit) {
        newBuyStateProfit = sellStateProfit - prices[i];
      } else {
        newBuyStateProfit = buyStateProfit;
      }

      if (buyStateProfit + prices[i] - fee > sellStateProfit) {
        newSellStateProfit = buyStateProfit + prices[i] - fee;
      } else {
        newSellStateProfit = sellStateProfit;
      }

      buyStateProfit = newBuyStateProfit;
      sellStateProfit = newSellStateProfit;
    }

    System.out.println("Total Profit : " + sellStateProfit);
  }

}

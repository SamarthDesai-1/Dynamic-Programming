public class BestTimeToBuyAndSellStocksInfiniteTransaction {

  public static void main(String[] args) {
    int[] prices = { 1, 2, 30, 4, 50 };

    int buyingDate = 0;
    int sellingDate = 0;
    int profit = 0;
    for (int i = 1; i < prices.length; i++) {
      if (prices[i] >= prices[i - 1])
        sellingDate++;

      else {
        profit += prices[sellingDate] - prices[buyingDate];
        buyingDate = sellingDate = i;
      }
    }
    profit += prices[sellingDate] - prices[buyingDate];

    System.out.println("Total Profit : " + profit);
  }

}

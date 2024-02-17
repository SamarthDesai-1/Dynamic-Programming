public class BestTimeToBuyAndSellStocks {

  public static void main(String[] args) {
    int[] prices = { 1, 2, 30, 4, 50 };

    int min = Integer.MAX_VALUE;
    int overallProfit = 0;
    int profitToday = 0;

    for (int i = 0; i < prices.length; i++) {
      min = Math.min(min, prices[i]);

      profitToday = prices[i] - min;

      overallProfit = Math.max(overallProfit, profitToday);
    }

    System.out.println("Total Profit : " + overallProfit);
  }
}
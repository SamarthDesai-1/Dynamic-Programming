public class BestTimeToBuyAndSellStocksWithTwoTransaction {

  public static void main(String[] args) {
    int[] prices = { 10, 20, 30 };

    int maxProfitIfSellToday = 0;
    int least = prices[0];
    int[] dp = new int[prices.length];

    for (int i = 1; i < prices.length; i++) {
      least = Math.min(least, prices[i]);
      maxProfitIfSellToday = prices[i] - least;

      if (maxProfitIfSellToday > dp[i - 1]) {
        dp[i] = maxProfitIfSellToday;
      } else {
        dp[i] = dp[i - 1];
      }
    }

    int maxProfitIfBoughtToday = 0;
    int maxAfterToday = prices[prices.length - 1];
    int[] dpx = new int[prices.length];

    for (int i = prices.length - 2; i >= 0; i--) {
      maxAfterToday = Math.max(maxAfterToday, prices[i]);
      maxProfitIfBoughtToday = maxAfterToday - prices[i];

      if (maxProfitIfBoughtToday > dpx[i + 1]) {
        dp[i] = maxProfitIfBoughtToday;
      } else {
        dp[i] = dp[i + 1];
      }
    }

    int totalMaxProfit = Integer.MIN_VALUE;
    for (int i = 0; i < prices.length; i++)
      totalMaxProfit = Math.max(totalMaxProfit, dp[i] + dpx[i]);

    System.out.println("Maximum profit : " + totalMaxProfit);
  }
}
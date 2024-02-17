public class BestTimeToBuyAndSellStocksWithCoolDownInfiniteTransaction {

  public static void main(String[] args) {
    int[] prices = { 10, 20, 30 };

    int obsp = -prices[0];
    int ossp = 0;
    int ocsp = 0;

    for (int i = 1; i < prices.length; i++) {
      int nbsp = 0;
      int nssp = 0;
      int ncsp = 0;

      if (ocsp - prices[i] > obsp) {
        nbsp = ocsp - prices[i];
      } else {
        nbsp = obsp;
      }

      if (obsp + prices[i] > ossp) {
        nssp = obsp + prices[i];
      } else {
        nssp = ossp;
      }

      if (ossp > ocsp) {
        ncsp = ossp;
      } else {
        ncsp = ocsp;
      }

      obsp = nbsp;
      ossp = nssp;
      ocsp = ncsp;
    }
    System.out.println("Total Profit After Cooldown : " + ossp);
  }

}

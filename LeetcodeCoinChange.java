import java.util.*;

public class LeetcodeCoinChange {

  public static int change(int[] coins, int amount) {
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {

      for (int coin : coins) {
        if (coin <= i) {
          dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        }
      }
    }

    int result = dp[amount];
    System.out.println(result);

    for (int element : dp)
      System.out.print(element + " ");

      return dp[amount] > amount ? -1 : dp[amount];
  }

  public static void main(String[] args) {
    int n = 3;
    int[] coins = { 1, 2, 5 };
    int amount = 11;

    System.out.println(change(coins, amount));

  }

}
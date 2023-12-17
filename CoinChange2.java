public class CoinChange2 {

    public static void main(String[] args) {
        int n = 4;
        int[] coins = { 2, 3, 5, 6 };
        int target = 10;

        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int amount = 1; amount <= target; amount++) {

            for (int coin : coins) {
                if (coin <= amount) {
                    int remAmount = amount - coin;
                    dp[amount] = dp[amount] + dp[remAmount];
                }
            }
        }

        int result = dp[target];
        System.out.println(result);
    }

}

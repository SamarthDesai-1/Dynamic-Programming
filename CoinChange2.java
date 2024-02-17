public class CoinChange2 {

    public static void main(String[] args) {
        int n = 3;
        int[] coins = { 1, 2, 5 };
        int target = 5;

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

        for (int element : dp)
            System.out.print(element + " ");
    }

}

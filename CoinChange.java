public class CoinChange {

    public static void main(String[] args) {
        int n = 3;
        int[] coins = { 2, 3, 5 };

        int amount = 7;

        int[] dp = new int[amount + 1];
        dp[0] = 1;

        for (int i = 0; i < coins.length; i++) {
            
            for (int j = coins[i]; j < dp.length; j++) {
                
                dp[j] = dp[j] + dp[j - coins[i]];
            }
        }

        System.out.println("Ways to give change of " + amount + " is : " + dp[amount]);
    }

}

public class MinCostForClimbingStairs {

    public static int findMinCost(int[] cost) {
        int n = cost.length;

        int[] dp = new int[n];
        dp[n - 1] = cost[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (i == n - 2) {
                dp[i] = cost[i] + Math.min(dp[i + 1], 0);
            } else {
                dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
            }
        }

        for (int element : dp)
            System.out.println(element);

        return Math.min(dp[0], dp[1]);
    }

    public static void main(String[] args) {
        int[] cost = { 1, 100, 1, 1, 1, 100, 1, 1, 100, 1 };

        System.out.println("Minimum cost is : " + findMinCost(cost));
    }

}

public class MinCostPathInMaze {

    public static int minCostPathMaze(int[][] cost) {
        int row = cost.length;
        int col = cost[0].length;

        int[][] dp = new int[row][col];
        dp[row - 1][col - 1] = cost[row - 1][col - 1];

        /* Below loop is used to fill or calculate the minimum cost of bottom row */
        for (int i = dp[row - 1].length - 2; i >= 0; i--) 
            dp[row - 1][i] = cost[row - 1][i] + dp[row - 1][i + 1];
        
        /* Calculate rest path minimum cost except bottom row */
        for (int i = dp.length - 2; i >= 0; i--) {
            for (int j = dp[0].length - 1; j >= 0; j--) {
                if (j == dp[0].length - 1) {
                    dp[i][j] = dp[i + 1][j] + cost[i][j];
                } 
                else {
                    dp[i][j] = cost[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);
                }
            }
        }

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] cost = {
            { 1, 2, 2 },
            { 1, 4, 5 },
            { 2, 2, 2 }
        };

        System.out.println("Minimumm cost path is : " + minCostPathMaze(cost));

    }

}

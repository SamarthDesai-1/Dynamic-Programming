public class KnapsackZeroOne {

    public static void display(int[][] dp) {
        for (int i = 0; i < dp.length; i++) {

            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] values = { 15, 14, 10, 45, 30 };
        int[] weight = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        int[][] dp = new int[n + 1][capacity + 1];

        /* I represents PLAYERS */
        for (int i = 1; i < dp.length; i++) {

            /* J represents BALLS */
            for (int j = 1; j < dp[0].length; j++) {

                if (j >= weight[i - 1]) {

                    int remainingCapacity = j - weight[i - 1];
                    if (dp[i - 1][remainingCapacity] + values[i - 1] > dp[i - 1][j]) {
                        dp[i][j] = dp[i - 1][remainingCapacity] + values[i - 1];
                    } 
                    else {
                        dp[i][j] = dp[i - 1][j]; /* when I dosen't bat */

                    }
                } 
                else {
                    dp[i][j] = dp[i - 1][j]; /* when I dosen't bat */
                }

            }
        }

        System.out.println("Maximum Capacity : " + dp[n][capacity]);

        display(dp);

    }

}
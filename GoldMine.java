public class GoldMine {

    /* Path with maximum gold */

    public static void main(String[] args) {
        int[][] mine = {
            { 7, 5, 2, 4, 6 },
            { 8, 3, 6, 8, 1 },
            { 8, 5, 6, 9, 2 },
            { 8, 5, 3, 6, 5 }
        };
        int row = mine.length;
        int col = mine[0].length;

        int[][] dp = new int[row][col];

        for (int i = 0; i < dp.length; i++) {
            dp[i][col - 1] = mine[i][col - 1];
        }

        for (int j = dp[0].length - 2; j >= 0; j--) {
            for (int i = dp.length - 1; i >= 0; i--) {
                if (i == 0) {
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j + 1], dp[i + 1][j + 1]);
                } else if (i == dp.length - 1) {
                    dp[i][j] = mine[i][j] + Math.max(dp[i][j + 1], dp[i - 1][j + 1]);
                } else {
                    dp[i][j] = mine[i][j] + Math.max(dp[i + 1][j + 1], Math.max(dp[i][j + 1], dp[i - 1][j + 1]));
                }
            }
        }

        int maxGold = dp[0][0];

        for (int i = 0; i < dp.length; i++) {
            maxGold = Math.max(dp[i][0], maxGold);
        }

        System.out.println("Maximum Gold : " + maxGold);

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

}


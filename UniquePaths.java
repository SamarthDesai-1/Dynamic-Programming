public class UniquePaths {

    public static int uniquePaths(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        int[][] dp = new int[row][col];

        /* First fill col - 1 column with value 1 */
        for (int i = 0; i < dp.length; i++) {
            dp[i][col - 1] = 1;
        }

        /* Second fill row - 1 row with value 1 */
        for (int i = 0; i < dp[row - 1].length; i++) {
            dp[row - 1][i] = 1;
        }

        /* Calculation of remainning part */ {
            for (int i = dp.length - 2; i >= 0; i--) {

                for (int j = dp[0].length - 2; j >= 0; j--) {
                    dp[i][j] = dp[i][j + 1] + dp[i + 1][j];
                }
            }
        }
        display(dp);
        return dp[0][0];
    }

    public static void display(int[][] element) {
        for (int[] array : element) {
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 },
            { 0, 0, 0, 0, 0 }
        };
        int result = uniquePaths(matrix);

        System.out.println("Unique Paths are : " + result);

    }

}

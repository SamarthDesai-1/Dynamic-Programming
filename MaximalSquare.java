public class MaximalSquare {

  static int maximalSquare(char[][] matrix) {
    if (matrix == null)
      return 0;

    int row = matrix.length;
    int col = matrix[0].length;

    int[][] dp = new int[row][col];
    int ans = 0;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (i == 0 || j == 0) {
          if (matrix[i][j] == '1') {
            dp[i][j] = 1;
          }
        } else {

          if (matrix[i][j] == '1') {

            dp[i][j] = Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j])) + 1;
          }
        }
        ans = Math.max(ans, dp[i][j]);

      }
    }

    return ans * ans;
  }

  public static void main(String[] args) {
    char[][] matrix = {
        { '1', '0', '1', '0', '0' },
        { '1', '0', '1', '1', '1' },
        { '1', '1', '1', '1', '1' },
        { '1', '0', '0', '1', '0' }
    };

    int area = maximalSquare(matrix);

    System.out.println(area);
  }
}
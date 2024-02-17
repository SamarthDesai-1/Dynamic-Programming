public class MinimumCoatPathGrid {

  static void display(int[][] ARRAY) {
    for (int[] array : ARRAY) {
      for (int nums : array) {
        System.out.print(nums + " ");
      }
      System.out.println();
    }
  }

  static int minPath(int[][] grid, int[][] cost) {
    int row = grid.length;
    int col = grid[0].length;

    int[][] dp = new int[row][col];
    for (int i = 0; i < col; i++) {
      dp[row - 1][i] = grid[row - 1][i];
    }

    for (int i = row - 2; i >= 0; i--) {

      for (int j = col - 1; j >= 0; j--) {

        int min = Integer.MAX_VALUE;
        int sum = 0;

        int element = grid[i][j];

        for (int expense = 0; expense < col; expense++) {

          sum = sum + element + cost[element][expense] + dp[i + 1][expense];
          System.out.println("Element : " + element + " " + "Cost : " + cost[element][expense] + " " + "Next ROW : " + dp[i + 1][expense]);
          min = Math.min(min, sum);
          sum = 0;
        }

        dp[i][j] = min;
      }
    }

    int min = Integer.MAX_VALUE;
    for (int i = 0; i < col; i++) {
      min = Math.min(min ,dp[0][i]);
    }
    display(dp);

    return min;
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 5, 3 },
        { 4, 0 },
        { 2, 1 }
    };
    int[][] cost = {
        { 9, 8 },
        { 1, 5 },
        { 10, 12 },
        { 18, 6 },
        { 2, 4 },
        { 14, 3 }
    };
    int answer = minPath(grid, cost);

    System.out.println("Minimum Cost is : " + answer);

  }

}


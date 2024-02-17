public class UniquePaths2 {

  public static class Solution {

    public void display(int[][] grid) {
      for (int[] array : grid) {
        System.out.print("{ ");
        for (int element : array) {
          System.out.print(element + " ");
        }
        System.out.print("}");
        System.out.println();
      }
    }

    public int paths(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;

      if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
        return 0; // If starting or ending position has an obstacle, no path exists
      }

      grid[0][0] = 1; // Set the starting position to 1 (represents a valid path)

      // Fill the first column
      for (int i = 1; i < m; i++) {
        grid[i][0] = (grid[i][0] == 0 && grid[i - 1][0] == 1) ? 1 : 0;
      }

      // Fill the first row
      for (int j = 1; j < n; j++) {
        grid[0][j] = (grid[0][j] == 0 && grid[0][j - 1] == 1) ? 1 : 0;
      }

      // Calculate paths for each cell in the grid
      for (int i = 1; i < m; i++) {
        for (int j = 1; j < n; j++) {
          if (grid[i][j] == 0) {
            grid[i][j] = grid[i - 1][j] + grid[i][j - 1];
          } else {
            grid[i][j] = 0; // If there is an obstacle, no path exists through this cell
          }
        }
      }
      display(grid);
      return grid[m - 1][n - 1];
    }

    public int paths2(int[][] grid) {
      int m = grid.length;
      int n = grid[0].length;
      if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return 0;

      int[][] dp = new int[m][n];

      for (int i = 0; i < n; i++) {
        if (grid[0][i] == 0) dp[0][i] = 1;
        else break;
      }

      for (int i = 0; i < m; i++) {
        if (grid[i][0] == 0) dp[i][0] = 1;
        else break;
      }

      for (int i = 1; i < dp.length; i++) {

        for (int j = 1; j < dp[0].length; j++) {
          if (grid[i][j] == 1) dp[i][j] = 0;
          else dp[i][j] = dp[i][j - 1] + dp[i - 1][j]; 
        }
      }
      display(dp);
      return dp[m - 1][n - 1];
    }
  }

  public static void main(String[] args) {
    int[][] grid = {
        { 0, 0, 0, 0, 0, 1 },
        { 0, 0, 1, 1, 0, 0 },
        { 0, 1, 0, 0, 1, 0 },
        { 0, 0, 1, 0, 0, 0 }
    };

    Solution obj = new Solution();
    // System.out.println("Number of unique paths are : " + obj.paths(grid));
    System.out.println("Number of unique paths are : " + obj.paths2(grid));
  }
}
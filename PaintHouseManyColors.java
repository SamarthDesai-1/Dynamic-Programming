public class PaintHouseManyColors {

  public static class PaintHouse {

    public int paintHouseManyColorsApproachONE(int[][] arr) {
      int[][] dp = new int[arr.length][arr[0].length];

      for (int j = 0; j < arr[0].length; j++) {
        dp[0][j] = arr[0][j];
      }

      for (int i = 1; i < dp.length; i++) {

        for (int j = 0; j < dp[0].length; j++) {
          int min = Integer.MAX_VALUE;

          for (int k = 0; k < dp[0].length; k++) {
            if (k != j) {
              min = Math.min(dp[i - 1][k], min);
            }
          }
          dp[i][j] = arr[i][j] + min;
        }
      }

      int min = Integer.MAX_VALUE;
      for (int i = 0; i < dp[arr.length - 1].length; i++) {
        min = Math.min(min, dp[arr.length - 1][i]);
      }
      return min;
    }

  }

  public static void main(String[] args) {
    int[][] arr = {
      { 1, 5, 7 },
      { 5, 8, 4 },
      { 3, 2, 9 },
      { 1, 2, 4 }
    };

    PaintHouse obj = new PaintHouse();

    System.out.println("Minimum cost to paint a house is : " + obj.paintHouseManyColorsApproachONE(arr));
  }

}

import java.util.Scanner;

public class PartitionIntoSubsets {

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.print("Enter number of Players : ");
    int n = obj.nextInt();
    System.out.print("Enter number of Teams : ");
    int k = obj.nextInt();

    if (n == 0 || k == 0 || n < k) {
      System.out.println(0);
      return;
    }

    int[][] dp = new int[k + 1][n + 1];

    /* i represnts teams */
    for (int i = 1; i < dp.length; i++) {

      /* j represnts players */
      for (int j = 1; j < dp[0].length; j++) {
        if (j < i) {
          continue;
        } else if (j == i) {
          dp[i][j] = 1;
        } else {
          dp[i][j] = dp[i - 1][j - 1] + dp[i][j - 1] * i;
        }
      }
    }

    System.out.println(dp[k][n]);
  }
}

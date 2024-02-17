import java.util.Scanner;

public class TillingWithDominios {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter floor length : ");
    int n = sc.nextInt();

    long[] dp = new long[n + 1];
    dp[1] = 1;
    dp[2] = 2;

    for (int i = 3; i <= n; i++) {
      dp[i] = dp[i - 1] + dp[i - 2];
    }
    System.out.println("Total ways to TILE on the N length floor : " + dp[n]);
  }

}

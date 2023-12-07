public class ClimbingStairs {

    public static void main(String[] args) {
        int n = 4;

        int ways = countWays(n, new int[n + 1]);

        System.out.println("Count ways using MEMOIZATION : " + ways);


        /* Using Tabulation */ {

            int[] dp = new int[n + 1];
            dp[0] = 1;
            for (int i = 1; i < dp.length; i++) {
                if (i == 1)
                    dp[i] = dp[i - 1];
                else if (i == 2)
                    dp[i] = dp[i - 1] + dp[i - 2];
                else
                    dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
            }

            System.out.println("Count ways using TABULATION : " + dp[dp.length - 1]);

        }

    }

    /* Using Memoization */

    private static int countWays(int n, int[] questionBank) {
        if (n == 0)
            return 1;
        else if (n < 0)
            return 0;

        if (questionBank[n] > 0)
            return questionBank[n];

        int one = countWays(n - 1, questionBank);
        int two = countWays(n - 2, questionBank);
        int three = countWays(n - 3, questionBank);

        int ans = one + two + three;
        questionBank[n] = ans;
        return ans;
    }

}

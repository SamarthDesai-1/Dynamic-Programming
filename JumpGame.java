public class JumpGame {

    public static boolean isPath(int[] jumps) {
        boolean[] dp = new boolean[jumps.length];

        dp[jumps.length - 1] = true;

        for (int i = dp.length - 2; i >= 0; i--) {
            if (jumps[i] == 0)
                continue;
            else {
                if ((jumps[i] + i) >= jumps.length)
                    return false;
                dp[i] = dp[jumps[i] + i] == true ? true : false;
            }
        }

        for (boolean element : dp)
            System.out.print(element + " ");

        return dp[0];
    }

    public static void main(String[] args) {
        int[] jumps = { 2, 3, 1, 1, 4 };

        System.out.println("Path exists confirmation : " + isPath(jumps));

    }

}

public class HouseRobber {

    public static int maxRobberAmount(int[] nums) {
        if (nums.length == 1)
            return nums[0];
            
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < dp.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }

        for (int element : dp)
            System.out.print(element + " ");

        System.out.println();

        return Math.max(dp[nums.length - 2], dp[nums.length - 1]);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 2 };

        System.out.println("Maximum robbery amount : " + maxRobberAmount(nums));
    }

}

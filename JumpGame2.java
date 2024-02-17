public class JumpGame2 {

    /* GREEDY APPROACH */
    public static boolean canJump(int[] nums) {
        int n = nums.length;
        if (n == 1)
            return true;

        int max = 0;
        for (int index = 0; index < n - 1 && max >= index; index++) {
            max = Math.max(max, index + nums[index]);

            if (max >= n - 1)
                return true;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 1, 4 };

        boolean canJump = canJump(nums);

        System.out.println("Destination reach confirmation : " + canJump);

    }

}

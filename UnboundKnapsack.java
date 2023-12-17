public class UnboundKnapsack {

    public static void main(String[] args) {
        int n = 5;
        int[] values = { 15, 14, 10, 45, 30 };
        int[] weight = { 2, 5, 1, 3, 4 };
        int capacity = 7;

        int[] dp = new int[capacity + 1];

        dp[0] = 0;
        for (int bagc = 1; bagc <= capacity; bagc++) {

            int max = 0;
            for (int i = 0; i < n; i++) {
                if (weight[i] <= bagc) {
                    int remainingCapacity = bagc - weight[i];
                    int remainingBagValue = dp[remainingCapacity];
                    int totalValue = remainingBagValue + values[i];

                    if (totalValue > max) {
                        max = totalValue;
                    }
                }
            }

            dp[bagc] = max;
        }

        System.out.println("Maximum amount of money can carry is : " + dp[capacity]);
        for (int element : dp)
            System.out.print(element + " ");
    }

}

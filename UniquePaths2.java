public class UniquePaths2 {

    public static void display(int[][] element) {
        for (int[] array : element) {
            for (int x : array) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }

    public static int uniquePaths(int[][] dp) {

        return dp[0][0];
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 0, 0, 0, 0, 0 },
                { 1, 0, 1, 0, 1 },
                { 0, 0, 1, 0, 0 },
                { 1, 1, 0, 0, 0 }
        };

    }

}

public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;

        int ans = fib(n ,new int[n + 1]);

        System.out.println(n + "th fibonacci is : " + ans);
    }

    /* Using Memoization TRICK */

    private static int fib(int n, int[] questionBank) {
        
        if (n == 0 || n == 1) return n;

        if (questionBank[n] != 0) return questionBank[n];

        int one = fib(n - 1, questionBank);
        int two = fib(n - 2, questionBank);

        questionBank[n] = one + two; 
        return one + two;
    }

}

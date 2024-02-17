import java.util.*;

public class CountABCsubsequence {

  public static class Solution {

    StringBuilder sb = new StringBuilder("");
    Solution(StringBuilder s) {
      sb = new StringBuilder(s);
    }

    public int countSubsequence() {
      int a = 0;
      int ab = 0;
      int abc = 0;

      for (int i = 0; i < sb.length(); i++) {
        char ch = sb.charAt(i);

        if (ch == 'a') a = 2 * a + 1;
        else if (ch == 'b') ab = 2 * ab + a;
        else if (ch == 'c') abc = 2 * abc + ab; 
      }

      return abc;
    }
  } 

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String : ");
    String s = sc.next();
    StringBuilder sb = new StringBuilder(s);

    Solution obj = new Solution(sb);

    int answer = obj.countSubsequence();

    System.out.println("Total ABC subsequence is : " + answer);
    
  }
  
}

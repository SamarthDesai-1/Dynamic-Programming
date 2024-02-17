public class MaximumSumNonAdjacentElement {

  public static void main(String[] args) {
    int[] arr = { 5, 10, 10, 100, 5, 6 };
    int include = arr[0];
    int exclude = 0;
    for (int i = 1; i < arr.length; i++) {
      int newInclude = exclude + arr[i];
      int newExlude = Math.max(include, exclude);

      include = newInclude;
      exclude = newExlude;
    }

    System.out.println(Math.max(include, exclude));
  }

}

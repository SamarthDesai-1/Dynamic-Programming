public class Triangle {

  static int minPath(int[][] arr) {
    int row = arr.length;
    int col = arr[0].length;

    for (int i = row - 2; i >= 0; i--) {

      int[] cache = arr[i];

      for (int j = 0; j < cache.length; j++) {
        arr[i][j] = Math.min(cache[j] + arr[i + 1][j], cache[j] + arr[i + 1][j + 1]);
      }
    }

    return arr[0][0];
  }

  public static void main(String[] args) {
    int[][] array = {
        { 2 },
        { 3, 4 },
        { 6, 5, 7 },
        { 4, 1, 8, 3 }
    };

    int minimumPath = minPath(array);
    System.out.println("Minimum path from top to bottom is : " + minimumPath);

    for (int[] arr : array) {
      for (int nums : arr) {
        System.out.print(nums + " ");
      }
      System.out.println();
    }

  }
}

public class PaintFence {

  public static void main(String[] args) {
    int n = 8; /* Fences you have */
    int k = 3; /* Colors you have */

    long same = k * 1;
    long diff = k * (k - 1);

    long total = same + diff;
    for (int i = 3; i <= n; i++) {
      same = diff * 1;
      diff = total * (k - 1);
      total = same + diff;
    }
    System.out.println(total);

  }
}

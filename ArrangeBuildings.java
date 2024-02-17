import java.util.Scanner;

public class ArrangeBuildings {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int Ozeros = 1;
    int Oones = 1;

    for (int i = 2; i <= n; i++) {

      int newZeros = Oones;
      int newOnes = Ozeros + Oones;

      Oones = newOnes;
      Ozeros = newZeros;
    }

    int total = Oones + Ozeros;
    System.out.println(total * total);
  }

}

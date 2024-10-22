import java.util.Scanner;
import java.lang.Math;

public class AnyBaseToDecimal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 1172
    int b = sc.nextInt(); // 8

    int result = getValueInBase(n, b);
    System.out.println(result);
  }

  public static int getValueInBase(int n, int b) {
    int rv = 0;
    int p = 0;

    while (n > 0) {
      int dig = n % 10;
      rv += dig * Math.pow(b, p);
      n = n / 10;
      p += 1;
    }

    return rv;
  }
}

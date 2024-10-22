import java.util.Scanner;
import java.lang.Math;

class DecimalToAnyBase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // 694
    int b = sc.nextInt(); // 8

    int result = getValueInBase(n, b);
    System.out.println(result);
  }

  public static int getValueInBase(int n, int b) {
    int rv = 0;
    int p = 0;

    while (n > 0) {
      int dig = n % b;
      rv += dig * Math.pow(10, p);
      n = n / b;
      p += 1;
    }

    return rv;
  }
}

// DecimalToAnyBase
// AnyBaseToDecimal
// AnyBaseToAnyBase
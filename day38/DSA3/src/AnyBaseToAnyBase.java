import java.util.Scanner;
import java.lang.Math;

public class AnyBaseToAnyBase {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int baseOf = sc.nextInt();
    int baseTo = sc.nextInt();

    // decimal 740 => octal 1344
    // decimal 740 => binary 1011100100

    int decimalResult = anyBaseToDecimal(num, baseOf);
    int result = decimalToAnyBase(decimalResult, baseTo);
    System.out.println(result);

  }

  public static int anyBaseToDecimal(int n, int b) {
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

  public static int decimalToAnyBase(int n, int b) {
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

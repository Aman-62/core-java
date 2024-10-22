public class StCh2 {
  static int gcd(int m, int n) {

    while (m != n) {
      if (m > n)
        m -= n;
      else
        n -= m;
    }

    return m;
  }

  public static void main(String[] args) {
    System.out.println(gcd(25, 15));
    System.out.println(gcd(35, 56));
  }
}

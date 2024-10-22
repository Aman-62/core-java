public class StCh1 {

  static boolean isPrime(int a) {
    for (int i = 2; i <= a / 2; i++) {
      if (a % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int x = 19;
    System.out.println(isPrime(x));
  }
}

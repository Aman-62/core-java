public class Pattern {
  public static void main(String[] args) {
    int n = 4;
    int sp = 2 * n - 3;
    int st = 1;

    for (int i = 1; i <= n; i++) {
      int val = 1;
      // star
      for (int j = 1; j <= st; j++) {
        System.out.print(val + " ");
        val++;
      }
      // space
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }
      if (i == n) {
        st--;
        val--;
      }
      // star
      for (int j = 1; j <= st; j++) {
        val--;
        System.out.print(val + " ");
      }
      System.out.println();

      st++;
      sp -= 2;
    }
  }
}

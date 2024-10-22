public class RightArrow {
  public static void main(String[] args) {
    // space 2, star 1
    // space 2, star 2
    // space 0, start 2, star 3
    // space 2, star 2
    // space 2, star 1

    int n = 5;
    int sp = 2;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sp; j++) {
        if (i == n / 2 + 1) {
          System.out.print("* ");
        } else {
          System.out.print("  ");
        }
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }
      System.out.println();

      if (i >= 3) {
        st--;
      } else {
        st++;
      }
    }
  }
}

public class Test {
  public static void main(String[] args) {
    int sp = 2;
    int st = 1;

    int val = 1;

    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }

      int temp = val;
      for (int j = 1; j <= st; j++) {
        System.out.print(temp + " ");
        if (j >= st / 2 + 1) {
          temp--;
        } else {
          temp++;
        }
      }
      System.out.println();

      if (i >= 3) {
        sp++;
        st -= 2;
        val--;
      } else {
        sp--;
        st += 2;
        val++;
      }
    }
  }
}

public class ForLoopDemo {
  public static void main(String[] args) {
    // for (int i = 1; i <= 10; i++) {
    // System.out.println(i);
    // }

    // int i = 1;
    // for (; i <= 5;) {
    // System.out.println(i);
    // i++;
    // }

    // for (int i = 10; i >= 1; i--) {
    // System.out.println(i);
    // }

    for (int i = 1, j = 1; i <= 10; i++, j = j * 2) {
      System.out.println(i + " " + j);
    }
  }
}

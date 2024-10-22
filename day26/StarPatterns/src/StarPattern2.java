public class StarPattern2 {
  public static void main(String[] args) {
    int st = 5;
    for (int i = 1; i <= 5; i++) {
      for (int j = 1; j <= st; j++) {
        System.out.print("*");
      }
      st--;
      System.out.println();
    }
  }
}

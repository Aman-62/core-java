import java.util.Scanner;

public class StarPattern3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows: ");
    int n = sc.nextInt();

    int sp = n - 1;
    int st = 1;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= sp; j++) {
        System.out.print("  ");
      }
      for (int j = 1; j <= st; j++) {
        System.out.print("* ");
      }
      sp--;
      st++;
      System.out.println();
    }
  }
}
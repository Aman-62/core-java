import java.util.Scanner;

public class Sc1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt();

    while (n > 0) {
      int r = n % 10;
      System.out.println(r);
      n = n / 10;
    }

  }
}

import java.util.*;

public class Sc7 {
  public static void main(String[] args) {
    System.out.println("Program to Fibonacci Series");
    System.out.println("Enter number of Terms");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int a = 0, b = 1, c;

    System.out.print(a + ", " + b + ", ");

    for (int i = 0; i < n - 2; i++) {
      c = a + b;
      System.out.print(c + ", ");
      a = b;
      b = c;
    }

  }

}

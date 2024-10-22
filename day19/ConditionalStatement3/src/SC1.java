import java.util.*;

public class SC1 {
  public static void main(String[] args) {
    // Question 1. Find if a given number is odd or even;
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number: ");
    n = sc.nextInt();

    int r = n % 2;
    if (r == 0) {
      System.out.println("It is a Even number");
    } else {
      System.out.println("It is a Odd number");
    }
  }
}

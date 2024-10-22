import java.util.Scanner;

public class Sc3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt(); // 2359
    int n2 = n;
    int n3 = n;
    int count = 0;
    double sum = 0;

    while (n2 > 0) {
      n2 = n2 / 10; // 235 23 2 0
      count++; // 1 2 3 4
    }
    while (n > 0) {
      int r = n % 10;
      sum = sum + Math.pow(r, count);
      n = n / 10;
    }

    if (sum == n3) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not an Armstrong Number");
    }

  }
}

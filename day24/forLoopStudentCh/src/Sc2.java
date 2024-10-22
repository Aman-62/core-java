import java.util.Scanner;

public class Sc2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number:");
    int n = sc.nextInt(); // 2359
    int count = 0;

    while (n > 0) {
      n = n / 10; // 235 23 2 0
      count++; // 1 2 3 4
    }

    System.out.println(count);

  }
}

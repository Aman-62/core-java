import java.util.*;

public class SC2 {
  public static void main(String[] args) {

    // Question 2. Find person is young or not
    // Explanation: if person's age is between 14 and 55 then he is young

    int age;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your age: ");
    age = sc.nextInt();

    if (age >= 14 && age <= 55) {
      System.out.println("You are young.");
    } else {
      System.out.println("You are not young.");

    }
  }
}

import java.util.*;

public class SC3 {
  public static void main(String[] args) {
    // Question 3. Find grades for given marks
    // 1. take marks of three subjects from user input
    // 2. calculate there average
    // 3. based on avg marks give grades to the student
    // avg > 70 'A'
    // 60 =< avg < 70 'B'
    // 50 =< avg < 60 'C'
    // 40 =< avg < 50 'D'
    // avg < 40 'F'

    int m1, m2, m3;

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter marks of 3 subjects: ");
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();

    float avg = (float) (m1 + m2 + m3) / 3;

    System.out.println(avg);

    if (avg > 70) {
      System.out.println("Grade A");
    } else if (avg >= 60 && avg < 70) {
      System.out.println("Grade B");
    } else if (avg >= 50 && avg < 60) {
      System.out.println("Grade C");
    } else if (avg >= 40 && avg < 50) {
      System.out.println("Grade D");
    } else {
      System.out.println("Grade F");
    }
  }

}

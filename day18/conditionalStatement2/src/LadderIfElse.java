public class LadderIfElse {
  public static void main(String[] args) {
    int marks = 99;

    if (marks >= 90) {
      System.out.println("Grade A");
    } else if (marks >= 80) {
      System.out.println("Grade B");
    } else if (marks >= 70) {
      System.out.println("Grade C");
    } else {
      System.out.println("Fail");
    }

    // if (marks >= 70) {
    // System.out.println("Grade C");
    // } else if (marks >= 80) {
    // System.out.println("Grade B");
    // } else if (marks >= 90) {
    // System.out.println("Grade A");
    // } else {
    // System.out.println("Fail");
    // }
  }
}

import java.util.*;

public class SC1 {
  public static void main(String[] args) {
    // 1. Display name of a day based on number
    // 2. Display name of month based on number
    // 3. Display type of website (Commercial, Organization, Government, Network)

    // 4. Menu Driven Program for Arithmetic Operations

    Scanner sc = new Scanner(System.in);
    System.out.println("Menu");
    System.out.println("====");
    System.out.println("ADD");
    System.out.println("SUB");
    System.out.println("MUL");
    System.out.println("DIV");

    System.out.println("Enter 2 Numbers:");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    sc.nextLine();
    System.out.println("Enter Option in Words");
    String str = sc.nextLine();
    String option = str.toUpperCase();

    switch (option) {
      case "ADD":
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        break;
      case "SUB":
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        break;
      case "MUL":
        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        break;
      case "DIV":
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        break;
      default:
        System.out.println("Invalid Option");
    }

  }
}

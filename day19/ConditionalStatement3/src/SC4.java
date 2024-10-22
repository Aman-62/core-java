import java.util.*;

public class SC4 {
  public static void main(String[] args) {

    // Question 4. Find radix of a number given in a String
    // "1010110" => binary '2'
    // "3234143" => octal '8'
    // "13987" => decimal '10'
    // "13987ae" => hexadecimal '16'
    String num;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a Number");
    num = sc.nextLine();

    if (num.matches("[01]+")) {
      System.out.println("Binary, Radix = 2");
    } else if (num.matches("[0-7]+")) {
      System.out.println("Octal, Radix = 8");
    } else if (num.matches("[0-9]+")) {
      System.out.println("Decimal, Radix = 10");
    } else if (num.matches("[0-9a-fA-F]+")) {
      System.out.println("HexaDecimal, Radix = 16");
    } else {
      System.out.println("Invalid Number");
    }
  }
}

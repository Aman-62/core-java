public class SC2 {
  public static void main(String[] args) {

    // Find if a Number is Binary or not
    int b = 1000110;
    String str1 = String.valueOf(b);
    System.out.println(str1.matches("[01]+"));

    // Find if a Number is Hexa-decimal or not
    String str2 = "2A34AB";
    System.out.println(str2.matches("[0-9a-fA-F]+"));

    // Find if the date is in Date formate (dd/mm/yyyy)
    String str3 = "01/12/2012";
    System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
  }
}

public class SC3 {
  public static void main(String[] args) {
    // Remove Special Characters from a String
    // Remove extra spaces from a String
    // Find number of words in a String

    // "a!b@c#d%e" -> abcde
    String str1 = "a!b@c#d%e";
    System.out.println(str1.replaceAll("[^a-zA-Z0-9]", ""));

    // " abc de fgh ijk " -> abcdefghijk
    String str2 = " abc   de    fgh ijk ";
    System.out.println(str2.replaceAll("\\s+", " ").trim());

    // "Hello world we are learning RegularExpression" -> 6
    String str3 = "Hello world we are learning RegularExpression. Bye";
    String words[] = str3.split("\\s+"); // ["Hello", "world", "we" ,"are" ...]
    System.out.println(words.length);
  }
}

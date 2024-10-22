import java.util.*;

public class SC6 {
  public static void main(String[] args) {
    // Question 7. Find type of website and the protocol used
    // "http://www.google.com"
    // http => hyper text transfer protocol
    // ftp => file transfer protocol
    // com => commercial
    // org => organizational
    // net => network

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the website URL");
    String url = sc.nextLine();

    String protocol = url.substring(0, url.indexOf(":"));

    if (protocol.equals("http")) {
      System.out.println("Hyper text transfer protocol");
    } else if (protocol.equals("ftp")) {
      System.out.println("File transfer protocol");
    }

    String ext = url.substring(url.lastIndexOf(".") + 1);

    if (ext.equals("com")) {
      System.out.println("Commercial");
    } else if (ext.equals("org")) {
      System.out.println("Organization");
    } else if (ext.equals("net")) {
      System.out.println("Network");
    }
  }
}

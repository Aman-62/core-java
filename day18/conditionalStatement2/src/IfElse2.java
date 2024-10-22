public class IfElse2 {
  public static void main(String[] args) {
    boolean hasDriversLicense = true; // A
    boolean hasGoodVision = true; // B

    // System.out.println("We are Strict");
    // System.out.println(hasDriversLicense && hasGoodVision);
    // System.out.println("We are not Strict");
    // System.out.println(hasDriversLicense || hasGoodVision);

    // if (hasDriversLicense && hasGoodVision) {
    // System.out.println("You can drive.");
    // } else {
    // System.out.println("You can't drive.");
    // }

    System.out.println(true && true && true && true);

    boolean isTired = false; // C

    if (hasDriversLicense && hasGoodVision && !isTired) {
      System.out.println("You can drive.");
    } else {
      System.out.println("You can't drive.");
    }
  }
}

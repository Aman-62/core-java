public class NestedIfElse {
  public static void main(String[] args) {
    // Discount Based on Membership and Purchase Amount

    // A store gives discount based on membership status and the amount spent by the
    // customer. Members spend over Rs. 100 get 10% discount, not-members spending
    // over Rs. 150 get 5% discount, and all others get no discount.

    boolean isMember = false;
    double purchaseAmount = 160.0;

    if (isMember) {
      if (purchaseAmount >= 100) {
        System.out.println("10% discount");
      } else {
        System.out.println("Sorry! No discount");
      }
    } else {
      if (purchaseAmount >= 150) {
        System.out.println("5% discount");
      } else {
        System.out.println("Sorry! No discount");
      }
    }

  }
}

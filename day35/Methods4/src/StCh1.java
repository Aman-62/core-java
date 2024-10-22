public class StCh1 {

  static int max(int... A) {
    if (A.length == 0)
      return Integer.MAX_VALUE;

    int max = A[0];
    for (int i = 0; i < A.length; i++) {
      if (max > A[i])
        max = A[i];
    }
    return max;
  }

  static int sum(int... A) {
    int sum = 0;
    for (int i = 0; i < A.length; i++) {
      sum += A[i];
    }
    return sum;
  }

  static double discount(int... T) {
    int totalBill = sum(T);

    if (totalBill < 500)
      return totalBill * 0.1;
    else if (totalBill >= 500 && totalBill <= 1000)
      return totalBill * 0.15;
    else
      return totalBill * 0.2;
  }

  public static void main(String[] args) {
    // 1. Maximum of numbers using varargs
    // 2. Sum of all elements using varargs
    // 3. Calculate Discount using varargs
    // sum < 500 / 10%
    // 1000 > sum > 500 / 15%
    // sum > 1000 / 20%

    System.out.println(sum(100, 200, 300));
    System.out.println(discount(100, 200, 300));
  }
}

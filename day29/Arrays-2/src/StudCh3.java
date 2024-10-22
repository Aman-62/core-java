public class StudCh3 {
  public static void main(String[] args) {
    // 3. Find largest el in an array
    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
    int max = A[0]; // 3

    for (int el : A) {
      if (el > max) {
        max = el;
      }
    }

    System.out.println("Maximum el: " + max);
  }
}

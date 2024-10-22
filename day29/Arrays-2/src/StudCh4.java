public class StudCh4 {
  public static void main(String[] args) {
    // 3. Find largest el in an array
    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
    int max1, max2;
    max1 = max2 = A[0]; // 3

    for (int el : A) {
      if (el > max1) {
        max2 = max1;
        max1 = el;
      } else if (el > max2) {
        max2 = el;
      }
    }

    System.out.println("Maximum1 & Maximum2 el: " + max1 + " " + max2);
  }
}

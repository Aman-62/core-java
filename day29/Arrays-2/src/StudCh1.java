public class StudCh1 {
  public static void main(String[] args) {
    // 1. Find Sum of all Elements in an array

    int[] A = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };
    int sum = 0;

    for (int i = 0; i <= A.length - 1; i++) {
      sum = sum + A[i];
    }

    System.out.println(sum);
  }
}

public class StCh2 {
  public static void main(String[] args) {

    int A[] = { 8, 6, 10, 9, 2, 15, 7, 13, 14, 11 };
    int B[] = new int[A.length];

    for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
      B[j] = A[i];
    }

    for (int i : B) {
      System.out.print(i + " ");
    }
  }
}

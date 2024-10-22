public class StCh3 {
  public static void main(String[] args) {

    int A[] = { 8, 6, 10, 9, 2 };

    int B[] = new int[10];

    for (int i = 0; i < A.length; i++) {
      B[i] = A[i];
    }

    A = B;
    B = null;

    for (int i : A) {
      System.out.print(i + " ");
    }
  }
}

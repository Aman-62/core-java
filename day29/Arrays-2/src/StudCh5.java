public class StudCh5 {
  public static void main(String[] args) {

    int A[] = { 5, 9, 6, 10, 12, 7, 3, 5, 4, 2 };
    // int temp = A[0];
    int temp2 = A[A.length - 1];

    // 1. rotate an array
    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + " ");
    }

    System.out.println();

    // for (int i = 0; i < A.length - 1; i++) {
    // A[i] = A[i + 1];
    // }
    // A[A.length - 1] = temp;

    for (int i = A.length - 1; i >= 1; i--) {
      A[i] = A[i - 1];
    }
    A[0] = temp2;

    for (int i = 0; i < A.length; i++) {
      System.out.print(A[i] + " ");
    }
  }
}

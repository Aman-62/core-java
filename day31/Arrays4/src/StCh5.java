public class StCh5 {
  public static void main(String[] args) {
    int A[][] = { { 3, 5, 9 }, { 7, 6, 2 }, { 4, 3, 5 } };
    int B[][] = { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };

    // Multiplication of two matrices
    int C[][] = new int[3][3];

    for (int i = 0; i <= A.length - 1; i++) {
      for (int j = 0; j <= A[i].length - 1; j++) {
        // C[i][j] = 0;
        for (int k = 0; k < 3; k++) {
          C[i][j] = C[i][j] + A[i][k] * B[k][j];
        }
      }
    }
    // i, j, k
    // 0
    // 0, 0, 0
    // 0, 0, 1
    // 0, 0, 2
    // 0, 1, 0
    // 0, 1, 1
    // 0, 1, 2
    // 0, 2, 0
    // 0, 2, 1
    // 0, 2, 2
    // 1,

    for (int x[] : C) {
      for (int y : x) {
        System.out.print(y + " ");
      }
      System.out.println();
    }

    // C[0][0] = A[0][0] + B[0][0]
    // C[0][1] = A[0][1] + B[0][1]
    // C[0][2] = A[0][2] + B[0][2]
    // C[1][0] = A[1][0] + B[1][0]

  }
}

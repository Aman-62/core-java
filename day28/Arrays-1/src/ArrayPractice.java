public class ArrayPractice {
  public static void main(String[] args) {
    int A[] = new int[10];
    int B[] = { 1, 2, 3, 4, 5 };

    int C[];
    C = new int[10];

    int[] D = new int[5];

    A[0] = 10;
    A[2] = 30;

    B[3] = 40;

    for (int i = 0; i <= B.length - 1; i++) {
      System.out.print(B[i] + " ");
    }
    System.out.println();

    for (int x : A) {
      System.out.print(x + " ");
    }
  }

}


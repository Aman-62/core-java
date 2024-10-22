public class StudCh7 {
  public static void main(String[] args) {
    int[] A = new int[10];
    A[0] = 5;
    A[1] = 9;
    A[2] = 6;
    A[3] = 10;
    A[4] = 12;
    A[5] = 7;
    // ...

    int length = 10;
    int numOfEl = 6;

    int index = 2;

    for (int i = index; i < numOfEl; i++) {
      A[i] = A[i + 1];
    }

    for (int i : A) {
      System.out.print(i + " ");
    }
  }

}

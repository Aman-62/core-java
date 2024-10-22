public class NestedArray {
  public static void main(String[] args) {
    int A[][] = new int[5][5];

    int B[][] = { { 2, 3, 4 }, { 6, 7, 8 }, { 10, 11, 12 } };

    int C[][];
    C = new int[5][5];

    int[][] D = new int[5][5];

    int[] E[] = new int[5][5];

    int[] F, G[];
    G = new int[5][5];

    int[] H, I, J, K[];

    for (int i = 0; i < B.length; i++) {
      for (int j = 0; j < B[i].length; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println();
    }
  }

}

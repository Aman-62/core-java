public class SpiralQuestion {
  public static void main(String[] args) {
    int arr[][] = {
        { 11, 12, 13, 14, 15, 16, 17 },
        { 21, 22, 23, 24, 25, 26, 27 },
        { 31, 32, 33, 34, 35, 36, 37 },
        { 41, 42, 43, 44, 45, 46, 47 },
        { 51, 52, 53, 54, 55, 56, 57 },
    };

    // for (int i = 0; i < arr.length; i++) {
    // for (int j = 0; j < arr[i].length; j++) {
    // System.out.print(arr[i][j] + " ");
    // }
    // System.out.println();
    // }

    int minr = 0;
    int minc = 0;
    int maxr = 4;
    int maxc = 6;

    int count = 0;
    int total = 35;

    while (count <= total) {
      // left wall
      for (int i = minr, j = minc; i <= maxr && count < total; i++) {
        System.out.println(arr[i][j]);
        count++;
      }

      minc++; // 1

      // bottom wall
      for (int i = maxr, j = minc; j <= maxc && count < total; j++) {
        System.out.println(arr[i][j]);
        count++;
      }

      maxr--; // 3

      // right wall
      for (int i = maxr, j = maxc; i >= minr && count < total; i--) {
        System.out.println(arr[i][j]);
        count++;
      }

      maxc--; // 5

      // top wall
      for (int i = minr, j = maxc; j >= minc && count < total; j--) {
        System.out.println(arr[i][j]);
        count++;
      }
      minr++;

    }
  }

}

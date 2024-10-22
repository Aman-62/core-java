import java.util.Scanner;

public class BarChart {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int arr[] = new int[n];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }

    int max = arr[0];
    for (int i : arr) {
      if (i > max)
        max = i;
    }

    // CODE HERE

    for (int i = max; i >= 1; i--) {
      for (int j = 0; j < arr.length; j++) {
        // System.out.print(arr[j] + " ");
        if (arr[j] >= i) {
          System.out.print("*");
        } else {
          System.out.print(" ");

        }
      }
      System.out.println();
    }

  }
}

import java.util.Scanner;

public class StudCh2 {
  public static void main(String[] args) {
    // 2. Search an element
    // Example: user: 6 output: 5

    int A[] = { 3, 9, 7, 8, 12, 6, 15, 5, 4, 10 };

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the element to search");
    int el = sc.nextInt();

    for (int i = 0; i < A.length; i++) {
      if (A[i] != el)
        continue;

      if (A[i] == el)
        System.out.println("Element found at index " + i);
    }

  }
}

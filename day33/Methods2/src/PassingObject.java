public class PassingObject {

  static void change(int X[], int index, int value) {
    X[index] = value;
  }

  static void change2(int x, int value) {
    x = value;
    System.out.println("x: " + x);
  }

  public static void main(String[] args) {
    int A[] = { 2, 3, 4, 5, 6 };

    change(A, 3, 200);

    for (int x : A) {
      System.out.print(x + " ");
    }
    System.out.println();

    int b = 10;
    change2(b, 1000);

    System.out.println(b);
  }
}

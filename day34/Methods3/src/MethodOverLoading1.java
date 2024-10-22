public class MethodOverLoading1 {

  static int max(int x, int y) {
    return x > y ? x : y;
  }

  static float max(float x, float y) {
    return x > y ? x : y;
  }

  static int max(int x, int y, int z) {
    return x > y && x > z ? x : (y > z ? y : z);
  }

  public static void main(String[] args) {

    byte a = 10;
    byte b = 5;
    System.out.println(max(a, b));

    System.out.println(max(10, 5));
    System.out.println(max(10f, 5f));
    System.out.println(max(3, 10, 3));
  }
}

public class StudentCh1 {

  static double area(double l, double b) {
    return l * b;
  }

  static double area(double r) {
    return Math.PI * r * r;
  }

  static double area(double a, double b, double h) {
    return 0.5 * (a + b) * h;
  }

  public static void main(String[] args) {
    System.out.println(area(5));
    System.out.println(area(8, 12));
    System.out.println(area(8, 12, 4));
  }
}
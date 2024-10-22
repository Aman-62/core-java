public class StudentCh3 {
  static boolean validate(String name) {
    return name.matches("[a-zA-Z\\s]+");
  }

  static boolean validate(int age) {
    return age >= 4 && age <= 18;
  }

  public static void main(String[] args) {
    System.out.println(validate(5));
    System.out.println(validate("Rahul Kumar"));
    System.out.println(validate("Rahul Kumar 09"));
  }

}

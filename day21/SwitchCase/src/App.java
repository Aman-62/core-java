public class App {
    public static void main(String[] args) throws Exception {
        String n = "1";

        switch (n) {
            case "1":
                System.out.println("One");
                break;
            case "2":
                System.out.println("Two");
                break;
            case "3":
                System.out.println("Three");
                break;
            default:
                System.out.println("Not Valid");
        }

        int num = 21;

        switch (num % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }
}

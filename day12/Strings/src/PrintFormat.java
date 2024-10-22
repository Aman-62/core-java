public class PrintFormat {
    public static void main(String[] args) {

        int x = 10;
        float y = 12.56f;
        char z = 'A';
        String str = "Java Program";

        System.out.printf("Hello %d %f %c World\n", x, y, z);
        System.out.printf("Hello %3$c %1$d %2$f World\n", x, y, z);
        System.out.printf("Hello %c %1$c %1$c World\n", z);
        System.out.printf("%3$s %2$f %1$d", x, y, str);

        // System.out.printf("Hello\n");
        // System.out.printf("World");
    }
}

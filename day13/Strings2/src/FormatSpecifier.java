public class FormatSpecifier {
    public static void main(String[] args) {
        int i = -10;

        float a = 123.45f;
        System.out.printf("%6.2f\n", a);

        // %[argument_index$][flag][width][.precision]conversion

        // System.out.printf("%5d\n", i);
        // System.out.printf("%05d\n", i);
        // System.out.printf("%-5d\n", i);
        // System.out.printf("%+5d\n", i);
        // System.out.printf("%(5d\n", i);

    }

}
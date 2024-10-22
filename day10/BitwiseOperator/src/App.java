public class App {
    public static void main(String[] args) throws Exception {

        int a = 10, b = 15;

        System.out.println(a + " " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);

        // adding two number in 1 byte (4bits,4bits)

        byte x = 9, y = 12;

        byte z;

        z = (byte) (x << 4);
        z = (byte) (z | y);

        System.out.println((z & 0b11110000) >> 4);
        System.out.println((z & 0b00001111));

    }
}

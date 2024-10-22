public class IncDec {
    public static void main(String[] args) {
        int x = 5, y;
        // y = x++;
        y = ++x;
        System.out.println("x:" + x + " y:" + y);

        int a = 5, b = 4, c;
        c = 2 * a++ + 3 * ++b;
        System.out.println(c);

        char i = 'A';
        i++;
        System.out.println(i);
    }

}

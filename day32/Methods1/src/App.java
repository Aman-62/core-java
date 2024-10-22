public class App {

    static int max(int x, int y) {
        if (x > y)
            return x;
        else
            return y;
    }

    public static void main(String[] args) throws Exception {
        int a = 10, b = 15, c;

        c = max(a, b);

        System.out.println(c);
        System.out.println(max(100, 200));
    }
}

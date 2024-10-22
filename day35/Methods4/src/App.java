public class App {

    static void show(int... x) {
        for (int i : x) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // static void show(int []x) {
    // for (int i : x) {
    // System.out.print(i + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) throws Exception {
        show();
        show(10, 20);
        show(10, 20, 30);
        show(10, 20, 30, 40);
        show(10, 20, 30, 40, 50);

        // int []A = new int[5];

        show(new int[] { 10, 20, 30, 40, 50 });
    }
}

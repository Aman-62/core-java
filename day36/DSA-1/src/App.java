public class App {
    public static void main(String[] args) throws Exception {
        int sp = 2;
        int st = 1;

        int val = 1;

        for (int i = 1; i <= 5; i++) {
            // space
            for (int j = 1; j <= sp; j++) {
                System.out.print("  ");
            }

            // star
            int temp = val;
            for (int j = 1; j <= st; j++) {
                // System.out.print("* ");
                System.out.print(temp + " ");
                if (j <= st / 2) {
                    temp++;
                } else {
                    temp--;
                }
            }

            if (i <= 2) {
                sp--;
                st += 2;
                val++;
            } else {
                sp++;
                st -= 2;
                val--;
            }
            System.out.println();
        }
    }
}

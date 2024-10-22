class Printing {
    public static void main(String[] args) {
        // Method overloading: Multiple methods with same name but different parameter
        // list.

        int x = 10, y = 20;
        float f = 12.45f;
        char c = 'A';
        String str = "Hello";

        System.out.println(x + " " + y);
        System.out.println("Number is " + y);
        System.out.println("Number is " + x + y);
        System.out.println("Number is " + (x + y));
        System.out.println(x + y + " Sum");

        // "Sum of 10 and 20 is 30"
        System.out.println("Sum of " + x + " and " + y + " is " + (10 + 20));
    }
}
public class StringMethods {
    public static void main(String[] args) {
        // String str = new String("NetBeans");
        // System.out.println(str);

        // System.out.println(str.length());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.toLowerCase());
        // System.out.println(str.trim());

        // System.out.println(str.substring(3));
        // System.out.println(str.substring(3, 5));

        // System.out.println(str.replace('e', 'o'));

        // System.out.println(str);

        // System.out.println("AB".compareTo("B"));
        String name = "Mr. Rahul Karpoor";

        System.out.println(name.startsWith("Mr."));
        System.out.println(name.endsWith("or"));

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");

        System.out.println(str1.equals(str3)); // true (value)
        System.out.println(str1 == str3); // false (object)

    }
}

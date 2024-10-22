import java.util.Scanner;

public class StudentChallenge1 {
    public static void main(String[] args) {
        float base, height, area;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base and Height: ");

        base = sc.nextFloat();
        height = sc.nextFloat();

        area = base * height * 0.5f;
        // area = base * height / 2;
        // area = 1f / 2f * base * height;

        System.out.println("Area of a Triangle is " + area);

        sc.close();
    }
}

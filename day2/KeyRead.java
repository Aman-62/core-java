import java.lang.*;
import java.util.Scanner;

class KeyRead {

	public static void main(String[] args) {

		//1. creating an object of Scanner class
		//2. System.in is connected with our keyboard
		Scanner sc = new Scanner(System.in);

		//int a, b, c;

		//System.out.println("Enter 2 number: ");

		//a = sc.nextInt();
		//b = sc.nextInt();
		//c = a + b;

		//System.out.println("Sum is " + c);

		//String name;
		//System.out.println("Enter your name...");
		//name = sc.nextLine();

		//System.out.println("Hello, " + name);

		sc.useRadix(2);

		int x = sc.nextInt();
		System.out.println(x);

	}

}
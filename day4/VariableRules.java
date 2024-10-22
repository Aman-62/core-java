import java.lang.*;

class VariableRules {

	public static void main(String[] args) {

		// 1. case sensitive
		int num = 23;
		int nuM = 50;

		// 2. can container _, $, number or alphabets
		char _first_character = 'A';
		System.out.println(_first_character);

		char $first$character$ = 'Q';
		System.out.println($first$character$);

		int years6 = 6;
		System.out.println(years6);

		// no reserved keyword or class name
		int $new = 12;
		System.out.println($new);
		
		// no limit on length
		int student_roll_number_of_computer_class = 12;
		
		// Camel Case
		int myNumber = 100;

	}

}
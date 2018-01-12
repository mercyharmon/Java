import java.util.Scanner;

public class MathPart1 {

	public static void main(String[] args) { //Calls methods, inputs, and calculate the sum of both numbers
		int number1 = 0;
		int number2 = 0;
		boolean validIntegers = false;
		boolean sumOfNumbersEqual = false;
		
		MathPart1 m = new MathPart1();
		
	
		number1 = getNumber();
		number2 = getNumber();

		validIntegers = m.validateLength(number1, number2);

		if (validIntegers) {
			sumOfNumbersEqual = m.sumOfNumberssEqual (number1, number2);
			System.out.println("Sum of digits in each position is equal: " + sumOfNumbersEqual);
		} else {
			System.out.println(
					"Both the same length. " + "Please Try Again.");
		}
	}

	 
	 
	private static int getNumber() { // Prompt user for number. 
		Scanner input = new Scanner(System.in);
		int number = 0;
		boolean numericInput = false;

		do {
			System.out.println("Enter a number Please : ");

			if (numericInput = input.hasNextInt()) {
				number = input.nextInt();
			} else {
				input.next();
			}
		} while (!numericInput);

		return number;
	}

	public boolean validateLength(int number1, int number2) { // Returns TRUE if both numbers are the same amount of digits long
		int lengthNumber1 = Integer.toString(number1).length();
		int lengthNumber2 = Integer.toString(number2).length();
		return (lengthNumber1 == lengthNumber2) && (lengthNumber1 > 1) && (lengthNumber2 > 1);
	}

	
	public static boolean sumOfNumberssEqual(int num1, int num2) { //Checks for sum of integers
		String number1 = Integer.toString(num1);
		String number2 = Integer.toString(num2);
		int sum = number1.charAt(0) + number2.charAt(0);

		for (int i = 1; i < number1.length(); i++) {
			if ((number1.charAt(i) + number2.charAt(i)) != sum) {
				return false;
			}
		}
		return true;
	}
}
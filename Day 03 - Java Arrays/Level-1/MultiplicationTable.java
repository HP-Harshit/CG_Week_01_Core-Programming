import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take a user input for the number
	System.out.println("Enter the number: ");
	int number = input.nextInt();

	// Create an array to store result of multiplication table
	int[] multiplicationTable = new int[10];

	// iterate a loop from 1 to 10 to store multipluication table result
	for(int i = 1; i<=10; i++) {
		// Calculating the result
		multiplicationTable[i-1] = number * i;
	}

	// iterate a loop from 1 to 10 to print multiplication table
	for(int i = 1; i<=10; i++) {
		// displaying the result
		System.out.println(number + " * " + i + " = " + multiplicationTable[i-1]);
	}

	// Close the Scanner Object
	input.close();

	}
}
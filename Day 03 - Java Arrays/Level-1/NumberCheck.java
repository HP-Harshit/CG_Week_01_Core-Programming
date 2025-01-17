import java.util.Scanner;

public class NumberCheck {
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Create an Array of size 5 to store the numbers
	int[] number = new int[5];

	// take user input for the numbers
	for(int i = 0; i<number.length; i++) {
		System.out.println("Enter the " + (i+1) +" number ");
		number[i] = input.nextInt();
	}

	// create a loop to iterate the number array
	for(int i = 0; i<number.length; i++) {

		// checking the number for positive
		if(number[i]>0) {
			// checking number for even or odd
			if(number[i]%2 == 0) {
				System.out.println("The number " + number[i] + " is even.");
			} else {
				System.out.println("The number " + number[i] + " is odd.");
			}
		} else if (number[i] < 0) {
				System.out.println("The number is negative");
		} else {
				System.out.println("The number is zero");
		}
		}

	// comparing the first and last number
	int firstElement = number[0], lastElement = number[number.length - 1];
	if (firstElement > lastElement) {
		System.out.println("First number is greater than last number.");
	} else if (firstElement < lastElement) {
		System.out.println("First number is less than last number.");
	} else {
		System.out.println("First number and last number both are equal.");
	}

	// Close the Scanner Object
	input.close();

	}
}
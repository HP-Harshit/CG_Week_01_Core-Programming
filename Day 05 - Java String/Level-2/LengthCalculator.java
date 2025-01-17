import java.util.Scanner;

public class LengthCalculator {

	// Method to calculate the length of the string
	public static int findLengthOfString(String text) {
		// Initialize the length variable to zero
		int length = 0;
		// Using try-catch block to catch the exception if any occurr
		try {
			// Looping while true
			while (true) {
				// Increment the length by 1 in each iteration
				text.charAt(length++);
			}
		} catch (StringIndexOutOfBoundsException e) {
			// If the exception is caught, Display the message
			System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			// If any other exception is caught, Display the message
			System.out.println("Generic Exception => " + e.getMessage());
		}
		// Return the length of the string
		return (length - 1);
	}

	// Main method
	public static void main(String[] args) {

		// create a scanner object to take an input from the user
		Scanner input = new Scanner(System.in);

		// Take a user input for text
		System.out.println("Enter the text");
		String text = input.nextLine();

		// Call a user-define method to get the length of string
		int userdefineLength = findLengthOfString(text);
		int builtinlength = text.length();

		// Display the result
		System.out.println("The lenght of string " + text + " using user-define method is " + userdefineLength);
		System.out.println("The lenght of string " + text + " using built-in method is " + builtinlength);

		// Close the Scanner Object
		input.close();

	}
}
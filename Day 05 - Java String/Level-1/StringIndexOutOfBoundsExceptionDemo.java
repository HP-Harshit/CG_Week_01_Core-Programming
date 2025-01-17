import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

	// Method to generate StringIndexOutOfBoundsException
	public static void generateStringIndexOutOfBoundsException(String text) {
		// This line will generate exception
		char ch = text.charAt(text.length() + 1); // Access index beyond the length of the String
	}

	// Method to handle StringIndexOutOfBoundsException
	public static void handleStringIndexOutOfBoundsException(String text) {
		try {
			// Access an index beyond the length of the String
			char ch = text.charAt(text.length() + 1);
		} catch (StringIndexOutOfBoundsException e) {
			// Handle the StringIndexOutOfBoundsException
			System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			// Handle any other exceptions
			System.out.println("Caught an Exception: " + e.getMessage());
		}
	}

	// Main Method
	public static void main(String[] args) {

		// Create a scanner class object
		Scanner input = new Scanner(System.in);

		// Take a user input for string
		System.out.println("Enter a text: ");
		String text = input.nextLine();

		// Call the method to generate StringIndexOutOfBoundsException
		System.out.println("Generating StringIndexOutOfBoundsException:");
		try {
			generateStringIndexOutOfBoundsException(text);
		} catch (Exception e) {
			// Caughting and printing the exception
			System.out.println("Exception caught in main: " + e.getMessage());
		}

		// Call the method to handle StringIndexOutOfBoundsException
		System.out.println("\nHandling StringIndexOutOfBoundsException:");
		handleStringIndexOutOfBoundsException(text);

		// Close the Scanner Object
		input.close();
	}
}

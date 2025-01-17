import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

	// Method to generate ArrayIndexOutOfBoundsException
	public static void generateArrayIndexOutOfBoundsException(String[] array, int size) {
		// This line will generate exception
		System.out.println(array[size + 1]); // Access index larger than the length of the array
	}

	// Method to handle ArrayIndexOutOfBoundsException
	public static void handleArrayIndexOutOfBoundsException(String[] array, int size) {
		try {
			// This line will generate exception
			System.out.println(array[size + 1]); // Access index larger than the length of the array
		} catch (ArrayIndexOutOfBoundsException e) {
			// Handle the ArrayIndexOutOfBoundsException
			System.out.println("Caught a ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			// Handle any other exceptions
			System.out.println("Caught an Exception: " + e.getMessage());
		}
	}

	// Main method
	public static void main(String[] args) {

		// Create a scanner class object
		Scanner input = new Scanner(System.in);

		// Take input for the size of an array
		System.out.println("Enter the size of the Array: ");
		int size = input.nextInt();

		// Create an Array of names
		String[] names = new String[size];

		// Take user input to store in array
		for (int i = 0; i < size; i++) {
			System.out.print("Enter the name " + (i + 1) + ": ");
			names[i] = input.next();
		}

		// Call the method to generate ArrayIndexOutOfBoundsException
		System.out.println("Generating ArrayIndexOutOfBoundsException:");
		try {
			generateArrayIndexOutOfBoundsException(names, size);
		} catch (Exception e) {
			System.out.println("Exception caught in main: " + e.getMessage());
		}

		// Call the method to handle ArrayIndexOutOfBoundsException
		System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
		handleArrayIndexOutOfBoundsException(names, size);

		// Close the Scanner object
		input.close();
	}
}

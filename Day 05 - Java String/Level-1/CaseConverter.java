import java.util.Scanner;

public class CaseConverter {

	// Method to convert text to uppercase using charAt() and ASCII values
	public static String convertToUpperCase(String text) {
		// Initialize an empty string to store the result
		String upperCaseText = "";
		// Iterate over each character in the input text
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c >= 'a' && c <= 'z') {
				upperCaseText += (char) (c - 32); // Convert lowercase to uppercase
			} else {
				upperCaseText += c; // Keep character as is
			}
		}
		// Return the resulting string
		return upperCaseText;
	}

	// Method to compare strings using charAt() method
	public static boolean compareStringsUsingCharAt(String text1, String text2) {
		// Check if both strings have the same length
		if (text1.length() != text2.length()) {
			return false; // Strings of different lengths can't be equal
		}
		// Iterate over each character in the strings
		for (int i = 0; i < text1.length(); i++) {
			// Compare characters at the current position
			if (text1.charAt(i) != text2.charAt(i)) {
				return false; // If any characters don't match, strings are not equal
			}
		}
		// If all characters match, strings are equal
		return true;
	}

	// Main method
	public static void main(String[] args) {

		// Create a scanner class object
		Scanner input = new Scanner(System.in);

		// Take user input for the string
		System.out.println("Enter a text: ");
		String text = input.nextLine();

		// Convert text to uppercase using user-defined method
		String userDefinedUpperCaseText = convertToUpperCase(text);

		// Convert text to uppercase using built-in method
		String builtInUpperCaseText = text.toUpperCase();

		// Calling methods to compare strings
		boolean isSame = compareStringsUsingCharAt(userDefinedUpperCaseText, builtInUpperCaseText);

		// Display the result
		System.out.println("Text using built-in toUpperCase(): " + builtInUpperCaseText);
		System.out.println("Text using custom method: " + userDefinedUpperCaseText);
		System.out.println("Are both texts equal? " + isSame);

		// Close the Scanner object
		input.close();
	}
}

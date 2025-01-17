import java.util.Scanner;

public class CaseConverter2 {

	// Method to convert text to lowercase using charAt() and ASCII values
	public static String convertToLowerCase(String text) {
		// Initialize an empty string to store the result
		String lowerCaseText = "";
		// Iterate over each character in the input text
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				lowerCaseText += (char) (c + 32); // Convert uppercase to lowercase
			} else {
				lowerCaseText += c; // Keep character as is
			}
		}
		return lowerCaseText;
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
		// If all characters match, so strings are equal
		return true;
	}

	// Main method
	public static void main(String[] args) {

		// Create a scanner class object
		Scanner input = new Scanner(System.in);

		// Take user input for the string
		System.out.println("Enter a text: ");
		String text = input.nextLine();

		// Convert text to lowercase using user-defined method
		String userDefinedLowerCaseText = convertToLowerCase(text);

		// Convert text to lowercase using built-in method
		String builtInLowerCaseText = text.toLowerCase();

		// Calling methods to compare strings
		boolean isSame = compareStringsUsingCharAt(userDefinedLowerCaseText, builtInLowerCaseText);

		// Display the result
		System.out.println("Text using built-in toLowerCase(): " + builtInLowerCaseText);
		System.out.println("Text using custom method: " + userDefinedLowerCaseText);
		System.out.println("Are both texts equal? " + isSame);

		// Close the Scanner object
		input.close();
	}
}

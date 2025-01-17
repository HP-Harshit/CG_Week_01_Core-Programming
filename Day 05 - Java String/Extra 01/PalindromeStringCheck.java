import java.util.Scanner;

public class PalindromeStringCheck {

	// Method to check palidrome
	public static boolean isStringPalindrome(String text) {
		int left = 0;
		int right = text.length() - 1;
		while (left < right) {
			if (text.charAt(left) != text.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	// Main method
	public static void main(String[] args) {

	// create a main class object to call methods


	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string to check palindrome
	System.out.println("Enter the text: ");
	String text = input.nextLine(); 

	// Calling method to check palidrome
	boolean isPalidrome = PalindromeStringCheck.isStringPalindrome(text);

	// Displaying the result
	if(isPalidrome){
		System.out.println("The string is Palindrome.");
	} else {
		System.out.println("The string is not Palindrome.");
	}

	// Close the Scanner Object
	input.close();

	}
}
import java.util.Scanner;

public class StringCharacters {

	// Method to extract character from string
	public static char[] usingCharAt(String text) {
		// Initialize a character array to store the characters
		char[] charArray = new char[text.length()];
		// Loop through the string and extract each character
		for(int i = 0; i< text.length(); i++) {
			// Extract the character at the current index
			charArray[i] = text.charAt(i);
		}
		// Return the character array
		return charArray;
	}

	// Method to compare two arrays
	public static boolean arrayComparison(char[] array1, char[] array2) {
		// Check if the arrays have the same length
		if (array1.length != array2.length) { 
			return false; // Arrays of different lengths can't be equal
		}
		// Loop through the arrays and compare each element
		for(int i = 0; i<array1.length; i++){
			// If any pair of elements are not equal, return false
			if(array1[i] != array2[i]){
				return false;
			}
		}
		// If we've checked all elements and haven't returned false, the arrays are equal
		return true;
	}

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string
	System.out.println("Enter text: ");
	String text = input.nextLine();

	// Calling a method to get a character array using user define method
	char[] charArray1 = usingCharAt(text);

	// Calling a method to get a character array using buily-in define method
	char[] charArray2 = text.toCharArray();

	// Calling a method to compare strings using the equals() method
	boolean isEqual = arrayComparison(charArray1, charArray2);

	// Display the result
	System.out.println("Character array using built-in toCharArray(): " + java.util.Arrays.toString(charArray2));
	System.out.println("Character array using custom method: " + java.util.Arrays.toString(charArray1));
	System.out.println("Comparison using array comparison method: " + (isEqual ? "Equal" : "Not Equal"));
	if(isEqual) {
		System.out.println("Both the result are same.");
	} else {
		System.out.println("Both the result are not same.");
	}

	// Close the Scanner Object
	input.close();

	}
}
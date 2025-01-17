import java.util.Scanner;

public class SubString {

	// Method to create substring using charAt method
	public static String subStringCharAt(String text, int start, int end){
		// Create a new empty string to store the substring
		String subString = "";
		// Loop through the text from start to end
		for(int i = start; i<end; i++){
			// Add the character at the end of the substring
			subString += text.charAt(i);
		}
		// Return the substring
		return subString;
	}

	// Method to compare string using charAt() method
	public static boolean stringUsingCharAt(String text1, String text2) {
		// Check if both strings have the same length
        if (text1.length() != text2.length()) {
           	return false; // Strings of different lengths can't be equal
       	}
		// Loop through the strings
		for(int i = 0; i< text1.length(); i++) {
			// If the characters at the current position are not equal, return false
			if (text1.charAt(i) != text2.charAt(i)){
				return false;
			}
		}
		// Return the result of the comparison
		return true;
	}

	// Method to compare strings using equals() method
	public static boolean stringUsingEquals(String text1, String text2) {
		// Return the result of the comparison
		return text1.equals(text2);
	}

	// Main method
	public static void main(String[] args) {

	// create a scanner object to take an input from the user
	Scanner input = new Scanner(System.in);

	// Take user input for string and start and end points for substring
	System.out.println("Enter text: ");
	String text = input.nextLine();
	System.out.println("Enter start point: ");
	int start = input.nextInt();
	System.out.println("Enter end point: ");
	int end = input.nextInt();

	// Calling a method to create a substring using charAt method()
	String subString1 = subStringCharAt(text, start, end);

	// Create a substring using built-in method substring()
	String subString2 = text.substring(start, end);

	// Calling a method to compare the string using charAt() method
	boolean isSame = stringUsingCharAt(subString1, subString2);

	// Calling a method to compare strings using the equals() method
	boolean isEqual = stringUsingEquals(subString1, subString2);

	// Display the result
	System.out.println("Substring using built-in substring(): " + subString2); 
	System.out.println("Substring using custom method: " + subString1); 
	System.out.println("Comparison using charAt() method: " + (isSame ? "Equal" : "Not Equal"));
	System.out.println("Comparison using equals() method: " + (isEqual ? "Equal" : "Not Equal"));
	if(isSame == isEqual) {
		System.out.println("Both the result are same.");
	} else {
		System.out.println("Both the result are not same.");
	}

	// Close the Scanner Object
	input.close();

	}
}